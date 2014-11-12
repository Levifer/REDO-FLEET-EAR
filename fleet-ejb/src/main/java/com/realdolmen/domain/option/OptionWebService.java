package com.realdolmen.domain.option;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@WebService
@Stateless
public class OptionWebService {

    @Inject
    private OptionRepository optionRepository;

    @WebMethod(action = "createOption")
    public void createOption(@WebParam(name = "option") Option option){
        optionRepository.persist(option);
    }

    @WebResult(name = "options")
    @WebMethod(action = "findAllOption")
    public List<Option> findAllOption(){
        return optionRepository.findAll();
    }

    @WebResult(name = "option")
    @WebMethod(action = "findOptionById")
    public Option findOptionById(@WebParam(name = "id") Integer id) {
        return optionRepository.find(id);
    }

    @WebResult(name = "options")
    @WebMethod(action = "findOptionByType")
    public List<Option> findOptionByType(@WebParam(name = "type") String type) {
        return optionRepository.FindByType(type);
    }

    @WebResult(name = "options")
    @WebMethod(action = "findOptionByName")
    public List<Option> findOptionByName(@WebParam(name = "name") String name) {
        return optionRepository.FindByName(name);
    }

    @WebResult(name = "optionss")
    @WebMethod(action = "findOptionLowerThandPrice")
    public List<Option> findOptionLowerThandPrice(@WebParam(name = "price") BigDecimal price) {
        return null;
    }

    @WebResult(name = "options")
    @WebMethod(action = "findOptionsByCarModelId")
    public List<Option> findOptionByCarModelId(@WebParam(name = "id") Integer id){
        return optionRepository.FindByCarModel(id);
    }
}
