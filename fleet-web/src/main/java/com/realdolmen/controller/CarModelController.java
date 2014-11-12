package com.realdolmen.controller;

import com.realdolmen.controller.mapper.CarmodelPackToPackMapper;
import com.realdolmen.controller.mapper.OptionToCarModelOptionMapper;
import com.realdolmen.controller.mapper.OptionToPackOptionMapper;
import com.realdolmen.controller.mapper.PackToCarModelOptionMapper;
import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.service.OptionWebServiceClient;
import com.realdolmen.service.PackWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.CarType;
import com.realdolmen.wsdl.carmodel.Fuel;
import com.realdolmen.wsdl.carmodel.Pack;
import com.realdolmen.wsdl.option.Option;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by TLAAU71 on 7/11/2014.
 */
@Controller
public class CarModelController {
    @LoggerProducer
    private Logger logger;

    @Autowired
    private CarModelWebServiceClient carModelWebServiceClient;

    @Autowired
    private OptionWebServiceClient optionWebServiceClient;

    @Autowired
    private PackWebServiceClient packWebServiceClient;

    private  List<Fuel> fuels;
    private List<Pack> packs;
    private List<CarType> types;
    private Pack pack = null;

    @RequestMapping("admin/carmodel")
    public String carModelList(Model model){
        model.addAttribute("carModels", carModelWebServiceClient.getAllCarModels());
        return "listCarModel";
    }

    @RequestMapping("admin/carmodel/new")
    public String addCarModel(Model model){
        populate(model);
        model.addAttribute("carModel", new CarModel());
        model.addAttribute("fuelList", fuels);
        model.addAttribute("packList",packs);
        model.addAttribute("typeList", types);
        model.addAttribute("pack",pack);
        model.addAttribute("optionsList", optionWebServiceClient.getAllOptions());
        return "insertCarModel";
    }

    @RequestMapping("admin/carmodel/{id}")
    public String updateCarModel(@PathVariable("id") String id, Model model){
        populate(model);
        CarModel carModel = carModelWebServiceClient.getCarModelsById(Integer.parseInt(id));
        carModel.setId(Integer.parseInt(id));
        model.addAttribute("carModel", carModel);
        model.addAttribute("fuelList", fuels);
        model.addAttribute("packList",packs);
        model.addAttribute("typeList", types);
        model.addAttribute("pack",pack);
        return "updateCarModel";
    }

    public void populate(Model model){
        fuels = new ArrayList<>();
        fuels.add(Fuel.BENZINE);
        fuels.add(Fuel.DIESEL);

        packs = new ArrayList<>();
        packs.add(new Pack());

        types = new ArrayList<>();
        types.add(CarType.BERLINE);
        types.add(CarType.BREAK);
        types.add(CarType.COUPE);
        types.add(CarType.HATCHBACK);
        types.add(CarType.JEEP);
        types.add(CarType.MONOVOLUME);
    }
    @RequestMapping(value="/admin/carmodel/add", method = RequestMethod.POST)
    public String insertCarModel(@ModelAttribute("carModel")CarModel carModel, BindingResult result,Model model, HttpServletRequest request){
        logger.info("Carmodel Valid");

        List<Option> optionList = optionWebServiceClient.getAllOptions();

        Pack pack = carModel.getPack();
        List<com.realdolmen.wsdl.carmodel.Option> carModelOptions = new ArrayList<com.realdolmen.wsdl.carmodel.Option>();
        OptionToCarModelOptionMapper optionMapper = new OptionToCarModelOptionMapper();
        CarmodelPackToPackMapper packMapper = new CarmodelPackToPackMapper();

        for(String id : request.getParameterValues("pack.options.option")){
            for(Option o : optionList){
                if(o.getOPTIONID().toString().equals(id)){
                    carModelOptions.add(optionMapper.mapTo(o));
                }
            }
        }

        pack.getOptions().getOption().addAll(carModelOptions);

        com.realdolmen.wsdl.pack.Pack persistingPack = packMapper.mapTo(pack);

        int id = packWebServiceClient.addPack(persistingPack);
        pack.setId(id);

        carModel.setPack(pack);
/*
        com.realdolmen.wsdl.pack.Pack originalPack = new com.realdolmen.wsdl.pack.Pack();
        List<com.realdolmen.wsdl.pack.Option> packOptions = new ArrayList<>();
        OptionToPackOptionMapper optionToPackOptionMapper = new OptionToPackOptionMapper();

        for(String id : request.getParameterValues("pack.options.option")){
            for(Option o : optionList){
                if(o.getOPTIONID().toString().equals(id)){
                    packOptions.add(mapOption(o));
                }
            }
        }

        com.realdolmen.wsdl.pack.Pack.Options optionsWrapper = new com.realdolmen.wsdl.pack.Pack.Options();
        for(com.realdolmen.wsdl.pack.Option option : packOptions){
            optionsWrapper.getOption().add(option);

        }

        originalPack.setOptions(optionsWrapper);

        originalPack.setBenefitPrice(carModel.getPack().getBenefitPrice());
        originalPack.setDowngrade(carModel.getPack().getDowngrade());
        originalPack.setPrice(carModel.getPack().getPrice());
        originalPack.setUpgrade(carModel.getPack().getUpgrade());

        int id = packWebServiceClient.addPack(originalPack);

        com.realdolmen.wsdl.pack.Pack createdPack = packWebServiceClient.findPackById(id);

        Pack carModelPack = mapPack(createdPack);
        carModel.setPack(carModelPack);
*/
        carModel.setYear(getCalendar());
        //carModel.setImageUrl(carModel.getBrand().toLowerCase() + "_" + carModel.getName().substring(0,carModel.getName().indexOf(" ")).toLowerCase() + "_" + carModel.getYear().getYear() + ".jpg");
        carModelWebServiceClient.addCarModel(carModel);
        logger.info("Carmodel is inserted");
        return "redirect:/admin/carmodel?created";
    }

    private Pack mapPack(com.realdolmen.wsdl.pack.Pack createdPack) {
        PackToCarModelOptionMapper packToCarModelOptionMapper = new PackToCarModelOptionMapper();
        Pack newPack = new Pack();
        newPack.setBenefitPrice(createdPack.getBenefitPrice());
        newPack.setDowngrade(createdPack.getDowngrade());
        newPack.setId(createdPack.getId());
        List<com.realdolmen.wsdl.carmodel.Option> options =  packToCarModelOptionMapper.mapTo(createdPack.getOptions().getOption());
        com.realdolmen.wsdl.carmodel.Pack.Options optionswrapper = new Pack.Options();
        for(com.realdolmen.wsdl.carmodel.Option opt : options){
            optionswrapper.getOption().add(opt);
        }

        newPack.setOptions(optionswrapper);

        newPack.setPrice(createdPack.getPrice());
        newPack.setUpgrade(createdPack.getUpgrade());

        return newPack;
    }

    @RequestMapping(value="/admin/carmodel/update", method = RequestMethod.POST)
    public String updateCarModel(@ModelAttribute("carModel")CarModel carModel,BindingResult result,Model model){
        carModel.setYear(getCalendar());
        carModel.setImageUrl(carModel.getBrand().toLowerCase() + "_" + carModel.getName().substring(0,carModel.getName().indexOf(" ")).toLowerCase() + "_" + carModel.getYear().getYear() + ".jpg");
        logger.info("Carmodel Valid");
        carModelWebServiceClient.updateCarModel(carModel);
        logger.info("Carmodel is updated");
        return "redirect:/admin/carmodel?updated";
    }

    private XMLGregorianCalendar getCalendar(){
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.setTime(new Date());
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

    private com.realdolmen.wsdl.pack.Option mapOption(Option o){
        com.realdolmen.wsdl.pack.Option opt = new com.realdolmen.wsdl.pack.Option();
        opt.setDescription(o.getDescription());
        opt.setName(o.getName());
        opt.setOPTIONID(o.getOPTIONID());
        opt.setPrice(o.getPrice());
        opt.setType(o.getType());

        return opt;
    }



}
