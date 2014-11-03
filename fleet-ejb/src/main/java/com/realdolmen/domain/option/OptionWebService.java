package com.realdolmen.domain.option;


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
public class OptionWebService {

    @Inject
    private OptionRepository optionRepository;

    public List<Option> findAll(){
        return optionRepository.findAll();
    }

    public Option findById(Integer id) {
        return null;
    }

    public List<Option> findByType(String type) {
        return null;
    }

    public Option findByName(String name) {
        return null;
    }

    public List<Option> findLowerThandPrice(BigDecimal price) {
        return null;
    }
}
