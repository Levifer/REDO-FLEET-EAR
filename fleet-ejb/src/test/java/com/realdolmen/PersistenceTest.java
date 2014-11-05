package com.realdolmen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class PersistenceTest {
    private static final Logger logger = LoggerFactory.getLogger(PersistenceTest.class);

    private static EntityManagerFactory emf;

    private EntityManager em;
    private EntityTransaction transaction;

    @BeforeClass
    public static void initEM(){
        logger.info("Creating Em");
        emf = Persistence.createEntityManagerFactory("fleettest");
    }

    @Before
    public void init(){
        logger.info("initialize");
        em = emf.createEntityManager();
        transaction = em.getTransaction();
        transaction.begin();
    }

    @After
    public void destroy(){
        logger.info("commiting and destroy transaction & em");
        if(transaction != null && !transaction.getRollbackOnly())
            transaction.commit();
        if(em != null)
            em.close();
    }

    @AfterClass
    public static void destroyEmf(){
        logger.info("closing emf");
        if(emf != null)
            emf.close();
    }

    protected EntityManager em(){
        return this.em;
    }
}
