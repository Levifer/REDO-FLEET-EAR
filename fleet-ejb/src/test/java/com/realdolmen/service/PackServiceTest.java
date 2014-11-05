package com.realdolmen.service;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.PackRepository;
import com.realdolmen.domain.pack.PackWebService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by TLAAU71 on 31/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class PackServiceTest {

    @InjectMocks
    private PackWebService packWebService;

    @Mock
    private PackRepository packRepository;

    private Pack pack;

    private List<Option> options;

    @Before
    public void setUp() throws Exception{
        pack = new Pack();
        setUpTestOptions();
    }

    public void setUpTestOptions(){
        options = new ArrayList<>();
        Option option = new Option(Enums.Technical.BRAKES.getLabel(), "ABS", "", new BigDecimal(100));
        Option option2 = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "ESP", "", new BigDecimal(100));
        Option option3 = new Option(Enums.Interior.OTHER.getLabel(), "7 Airbag", "", new BigDecimal(100));
        Option option4 = new Option(Enums.Interior.STEERING_WHEEL.getLabel(), "Leather", "", new BigDecimal(100));
        Option option5 = new Option(Enums.Exterior.WHEELS.getLabel(), "Pressure monitoring", "", new BigDecimal(100));
        options.add(option);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        options.add(option5);
    }

    @Test
    public void testFindAll() throws Exception{
        packWebService.findAllPacks();
        verify(packRepository,times(1)).findAll();
    }

    @Test
    public void testFindById() throws Exception{
        packWebService.findPackById(1);
        verify(packRepository,times(1)).find(1);
    }

}
