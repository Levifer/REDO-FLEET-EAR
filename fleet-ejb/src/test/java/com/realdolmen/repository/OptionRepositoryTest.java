package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.PersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.option.OptionRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class OptionRepositoryTest extends ImportPersistenceTest {

    private Option option;

    @Inject
    private OptionRepository optionRepository;

    @Before
    public void Setup(){
        option = new Option(Enums.Technical.BRAKES.getLabel(), "ABS", "description", new BigDecimal(500));
        //optionRepository.findAll();
    }
    @Test
    public void testPersistOption() throws Exception {
        em().persist(option);
        assertNotNull(option.getId());
    }

    @Test
    public void testRemoveOption() throws Exception {
        em().remove(option);
        assertNull(option.getId());
    }

    @Test
    public void testRetrieveOption() throws Exception {
        Option option = em().getReference(Option.class, 1);
        assertNotNull(option.getDescription());
    }

    @Test
    public void testUpdateOption() throws Exception {
        Option option = em().getReference(Option.class, 1);
        assertEquals("ABS",option.getName());
        option.setName("Anti-Lock Break System");
        em().merge(option);
        assertEquals("Anti-Lock Break System",option.getName());
    }

    @Test
    @Ignore
    public void testFindByType() throws Exception {
        String type = Enums.CarType.HATCHBACK.getLabel();
        List<Option> list = optionRepository.FindByType(type);
        assertTrue(list.size() > 0);
    }

    @Test
    @Ignore
    public void testFindByName() throws Exception {
        String name = "A3";
        List<Option> list = optionRepository.FindByName(name);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testFindAllOptions() throws Exception {
        List resultList = em().createQuery("SELECT o from Option o",Option.class).getResultList();
        assertTrue(resultList.size() >= 0);
        assertNotNull(resultList.get(1));
    }
}
