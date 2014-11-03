package com.realdolmen.service;

import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.option.OptionService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by TLAAU71 on 31/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
//TODO TEST CONFIG
public class OptionServiceTest {

    @InjectMocks
    private OptionService optionService;

    @Mock
    private OptionRepository optionRepository;

    @Before
    public void setUp() throws Exception{
        optionService = Mockito.mock(OptionService.class);
        optionRepository = Mockito.mock(OptionRepository.class);
    }

    @Test
    public void testFindAll(){
        optionService.findAll();
        verify(optionService,times(1)).findAll();
    }
}
