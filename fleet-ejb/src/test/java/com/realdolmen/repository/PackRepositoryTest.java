package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.Pack;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
@Ignore
public class PackRepositoryTest extends ImportPersistenceTest{
    private Pack pack;


    @Before
    public void Setup(){
        List<Option> options = em().createQuery("Select o from Option o",Option.class).getResultList();
        pack = new Pack(new BigDecimal(824.40), new BigDecimal(100), new BigDecimal(200), new BigDecimal(300), options);
    }
    @Test
    public void testPersistPack() throws Exception {
        em().persist(pack);
        assertNotNull(pack.getId());
    }

    @Test
    @Ignore
    public void testRemovePack() throws Exception {
        em().remove(pack);
        assertNull(pack.getId());
    }

    @Test
    public void testRetrievePack() throws Exception {
        Pack pack = em().getReference(Pack.class, 6);
        assertNotNull(pack.getPrice());
    }

    @Test
    @Ignore
    public void testUpdatePack() throws Exception {
        Pack pack = em().getReference(Pack.class, 6);
        assertEquals(new BigDecimal(824.40),pack.getPrice());
        pack.setPrice(new BigDecimal(900));
        em().merge(pack);
        assertEquals(new BigDecimal(900),pack.getPrice());
    }

    @Test
    public void testFindAllPacks() throws Exception {
        List resultList = em().createQuery("SELECT p from Pack p",Pack.class).getResultList();
        assertTrue(resultList.size() >= 0);
        assertNotNull(resultList.get(1));
    }
}
