package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.custompack.CustomPack;
import com.realdolmen.domain.option.Option;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
@Ignore
public class CustomPackRepository extends ImportPersistenceTest {
    private CustomPack customPack;

    private int size;

    @Before
    public void Setup(){
        List<Option> options = em().createQuery("SELECT o from fleet_option o", Option.class).getResultList();
        customPack = new CustomPack(options);
        size = options.size();
    }
    @Test
    public void testPersistCustomPack() throws Exception {
        em().persist(customPack);
        assertNotNull(customPack.getId());
    }

    @Test
    public void testRemoveCustomPack() throws Exception {
        em().remove(customPack);
        assertNull(customPack.getId());
    }

    @Test
    public void testRetrieveCustomPack() throws Exception {
        CustomPack customPack = em().getReference(CustomPack.class, 1);
        assertNotNull(customPack.getId());
    }

    @Test
    public void testUpdateCustomPack() throws Exception {
        CustomPack customPack = em().getReference(CustomPack.class, 1);
        assertEquals(size,customPack.getOptions().size());
        List<Option> list = customPack.getOptions();
        list.add(new Option(Enums.Technical.BRAKES.getLabel(), "ABS", "description", new BigDecimal(500)));
        em().merge(customPack);
        assertEquals(size+1,customPack.getOptions().size());
    }

    @Test
    @Ignore
    public void testFindAllCustomPacks() throws Exception {
        List resultList = em().createQuery("SELECT c from customPack c",CustomPack.class).getResultList();
        assertNotNull(resultList.size());
        assertNotNull(resultList.get(1));
    }
}
