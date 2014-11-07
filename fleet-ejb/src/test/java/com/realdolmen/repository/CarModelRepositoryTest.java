package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.pack.Pack;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class CarModelRepositoryTest extends ImportPersistenceTest{
    private CarModel carModel;

    @Before
    public void Setup(){
        Pack pack = em().getReference(Pack.class,12);
        carModel = new CarModel("Audi", "A3 sportback 1,6 tdi 105 pk ultra attraction" ,Enums.CarType.HATCHBACK,Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 20, 9, 88, 2, "", pack);
    }
    @Test
    public void testPersistCarModel() throws Exception {
        em().persist(carModel);
        assertNotNull(carModel.getId());
    }

    @Test
    public void testRemoveCarModel() throws Exception {
        em().remove(carModel);
        assertNull(carModel.getId());
    }

    @Test
    @Ignore
    public void testRetrieveCarModel() throws Exception {
        CarModel carModel = em().getReference(CarModel.class, 15);
        assertNotNull(carModel.getBrand());
    }

    @Test
    @Ignore
    public void testUpdateCarModel() throws Exception {
        CarModel carModel = em().getReference(CarModel.class, 15);
        assertEquals("A3 sportback 1,6 tdi 105 pk ultra attraction",carModel.getName());
        carModel.setName("A3");
        em().merge(carModel);
        assertEquals("A3",carModel.getName());
    }

    @Test
    @Ignore
    public void testFindAllCarModels() throws Exception {
        List resultList = em().createQuery("SELECT c from CarModel c",CarModel.class).getResultList();
        assertTrue(resultList.size() >= 0);
        assertNotNull(resultList.get(1));
    }
}
