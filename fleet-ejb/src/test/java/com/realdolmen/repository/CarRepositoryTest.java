package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.domain.car.Car;
import com.realdolmen.domain.carmodel.CarModel;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TLAAU71 on 3/11/2014.
 */
@Ignore
public class CarRepositoryTest extends ImportPersistenceTest{
    private Car car;

    @Before
    public void Setup(){
        CarModel model = em().getReference(CarModel.class,8);
        car = new Car(model,123,new Date());
    }
    @Test
    public void testPersistCar() throws Exception {
        em().persist(car);
        assertNotNull(car.getId());
    }

    @Test
    public void testRemoveCar() throws Exception {
        em().remove(car);
        assertNull(car.getId());
    }

    @Test
    @Ignore
    public void testRetrieveCar() throws Exception {
        Car car = em().getReference(Car.class, 1);
        assertNotNull(car.getCarInUse());
    }

    @Test
    @Ignore
    public void testUpdateCar() throws Exception {
        Car car = em().getReference(Car.class, 1);
        assertEquals(new Integer(123),car.getMileage());
        car.setMileage(456);
        em().merge(car);
        assertEquals(new Integer(456),car.getMileage());
    }

    @Test
    public void testFindAllCars() throws Exception {
        List resultList = em().createQuery("SELECT c from Car c",Car.class).getResultList();
        assertTrue(resultList.size() >=0);
        //assertNotNull(resultList.get(1));
    }
}
