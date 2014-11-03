package com.realdolmen.service;

import com.realdolmen.domain.pack.PackRepository;
import com.realdolmen.domain.pack.PackWebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by TLAAU71 on 31/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class PackServiceTest {

    @InjectMocks
    private PackWebService packService;

    @Mock
    private PackRepository packRepository;
    @Test
    public void testTEST() throws Exception {

    }
}
