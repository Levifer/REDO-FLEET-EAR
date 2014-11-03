package com.realdolmen.service;

import com.realdolmen.domain.car.CarRepository;
import com.realdolmen.domain.car.CarWebService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by TLAAU71 on 31/10/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

    @InjectMocks
    private CarWebService carWebService;

    @Mock
    private CarRepository carRepository;



}
