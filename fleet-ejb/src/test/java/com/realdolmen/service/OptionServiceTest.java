package com.realdolmen.service;

import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.option.OptionWebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

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
    public void testTEST() throws Exception {

    }

}
