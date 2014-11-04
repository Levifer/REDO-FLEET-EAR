package com.realdolmen.service;

import com.realdolmen.domain.car.CarRepository;
import com.realdolmen.domain.car.CarWebService;
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
public class CarServiceTest {

    @InjectMocks
    private CarWebService carWebService;

    @Mock
    private CarRepository carRepository;

    @Before
    public void setUp(){
        carWebService = Mockito.mock(CarWebService.class);
        carRepository = Mockito.mock(CarRepository.class);
    }

    @Test
    public void testFindById() throws Exception {
        carWebService.findById(1);
        verify(carWebService, times(1)).findById(1);
    }
}
