package com.realdolmen.controller;

import com.realdolmen.service.OptionWebServiceClient;
import com.realdolmen.service.PackWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.option.Option;
import com.realdolmen.wsdl.pack.Pack;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
@Controller
public class PackController {

    @LoggerProducer
    private Logger logger;

    @Autowired
    private OptionWebServiceClient optionWebServiceClient;

    @Autowired
    PackWebServiceClient packWebServiceClient;
    @RequestMapping("admin/pack")
    public String packList(Model model){
        model.addAttribute("pack", new Pack());
        model.addAttribute("optionsList", optionWebServiceClient.getAllOptions());
        return "insertPack";
    }

    @RequestMapping(value="/admin/pack/add", method = RequestMethod.POST)
    public String insertPack(@ModelAttribute("pack")Pack pack,HttpServletRequest request, BindingResult result,Model model){
        logger.info("selected options: " + request.getParameterValues("options.option").length);
        List<Option> optionList = optionWebServiceClient.getAllOptions();
        for(String id : request.getParameterValues("options.option")){
            for(Option o : optionList){
                if(o.getOPTIONID().toString().equals(id)){
                    com.realdolmen.wsdl.pack.Option opt = new com.realdolmen.wsdl.pack.Option();
                    opt.setDescription(o.getDescription());
                    opt.setName(o.getName());
                    opt.setOPTIONID(o.getOPTIONID());
                    opt.setPrice(o.getPrice());
                    opt.setType(o.getType());
                    pack.getOptions().getOption().add(opt);
                }
            }
        }
        //for(Option o : request.getParameterValues("options"))
        logger.info(pack.getPrice().toPlainString());
        packWebServiceClient.addPack(pack);
        logger.info("Carmodel is inserted");
        return "redirect:/admin/pack";
    }
}
