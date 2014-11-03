package com.realdolmen.domain.pack;

import com.realdolmen.domain.option.Option;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@WebService
@Transactional
public class PackWebService {

    @Inject
    private PackRepository packRepository;

    public List<Pack> findAll(){
        return packRepository.findAll();
    }

    public Pack findById(Integer id){
        return packRepository.find(id);
    }

    public Pack updatePack(Pack pack){
        return packRepository.update(pack);
    }

}
