package com.realdolmen.service;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.option.OptionWebService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
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

    @Before
    public void setUp() throws Exception{
        optionWebService = Mockito.mock(OptionWebService.class);
        optionRepository = Mockito.mock(OptionRepository.class);
    }

    @Test
    public void testFindAll(){
        optionWebService.findAll();
        verify(optionWebService,times(1)).findAll();
    }

    @Test
    public void testFindById() throws Exception {
        optionWebService.findById(1);
        verify(optionWebService,times(1)).findById(1);
    }

    @Test
    public void testFindByType() throws Exception {
        optionWebService.findByType("airco");
        verify(optionWebService,times(1)).findByType("airco");
    }

    @Test
    public void testFindByName() throws Exception {
        optionWebService.findByName("airco");
        verify(optionWebService,times(1)).findByName("airco");
    }

    @Test
    public void testFindLowerThanPrice() throws Exception {
        optionWebService.findLowerThandPrice(new BigDecimal(500));
        verify(optionWebService,times(1)).findLowerThandPrice(new BigDecimal(500));
    }
}
