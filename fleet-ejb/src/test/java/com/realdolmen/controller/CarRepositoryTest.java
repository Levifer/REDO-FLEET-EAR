package com.realdolmen.controller;

import com.realdolmen.domain.car.CarRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by TLAAU71 on 3/11/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarRepositoryTest {
    @InjectMocks
    private CarRepository carRepository;

    @Before
    public void SetUp(){

    }

    @Test
    public void testFindCarById() throws Exception {

    }
}
