package com.realdolmen.domain.option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Service
@Transactional
public class OptionWebService {

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> findAll(){
        return optionRepository.findAll();
    }
}
