package com.realdolmen.domain.custompack;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@WebService
@Stateless
public class CustomPackWebService {

    @Inject
    private CustomPackRepository customPackRepository;

    @WebMethod(action = "createCustomPack")
    public void createCustomPack(@WebParam(name = "customPack") CustomPack customPack){
        customPackRepository.persist(customPack);
    }

    @WebResult(name = "customPack")
    @WebMethod(action = "findCustomPackById")
    public CustomPack findCustomPackById(@WebParam(name = "id")Integer id){
        return customPackRepository.find(id);
    }

    @WebResult(name = "CustomPacks")
    @WebMethod(action = "findAllCustomPacks")
    public List<CustomPack> findAllCustomPacks(){
        return customPackRepository.findAll();
    }

}
