package com.realdolmen.service;

import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.option.OptionWebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by TLAAU71 on 31/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class OptionServiceTest {

    @InjectMocks
    private OptionWebService optionWebService;

    @Mock
    private OptionRepository optionRepository;


    @Test
    public void testFindAll(){
        optionWebService.findAllOption();
        verify(optionRepository,times(1)).findAll();
    }

    @Test
    public void testFindById() throws Exception {
        optionWebService.findOptionById(1);
        verify(optionRepository,times(1)).find(1);
    }

    @Test
    public void testFindByType() throws Exception {
        optionWebService.findOptionByType("airco");
        verify(optionRepository,times(1)).FindByType("airco");
    }

    @Test
    public void testFindByName() throws Exception {
        optionWebService.findOptionByName("airco");
        verify(optionRepository,times(1)).FindByName("airco");
    }

    @Test
    public void testFindLowerThanPrice() throws Exception {
        optionWebService.findOptionLowerThandPrice(new BigDecimal(500));
        //verify(optionRepository,times(1)).findLowerThanPrice(new BigDecimal(500));
    }
}
