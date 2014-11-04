package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.PersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.option.Option;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class OptionRepositoryTest extends ImportPersistenceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Option option;

    @Before
    public void Setup(){
        option = new Option(Enums.Technical.BRAKES.getLabel(), "ABS", "description", new BigDecimal(500));
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
    public void testFindAllOptions() throws Exception {
        List resultList = em().createQuery("SELECT o from fleet_option o",Option.class).getResultList();
        assertNotNull(resultList.size());
        assertNotNull(resultList.get(1));
    }
}
