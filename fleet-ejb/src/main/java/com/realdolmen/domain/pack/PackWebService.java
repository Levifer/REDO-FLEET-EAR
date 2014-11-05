package com.realdolmen.domain.pack;

import com.realdolmen.domain.option.Option;

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
public class PackWebService {

    @Inject
    private PackRepository packRepository;

    @WebResult(name = "packs")
    @WebMethod(action = "findAllPacks")
    public List<Pack> findAllPacks(){
        return packRepository.findAll();
    }

    @WebResult(name = "pack")
    @WebMethod(action = "findPackById")
    public Pack findPackById(@WebParam(name = "id") Integer id){
        return packRepository.find(id);
    }

    @WebMethod(action = "createPack")
    public void createPack(@WebParam(name = "pack") Pack pack){
        packRepository.persist(pack);
    }

    @WebResult(name = "packs")
    @WebMethod(action = "updatePack")
    public Pack updatePack(@WebParam(name = "pack") Pack pack){
        return packRepository.update(pack);
    }

}
