package com.realdolmen.repository;

import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.option.OptionRepository;
import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class OptionRepositoryTest {

    @Inject
    private OptionRepository optionRepository;

    @Test
    @Ignore
    public void testFindAll() throws Exception {
        List<Option> options = optionRepository.findAll();
        assertEquals("FindAll option listsize", 5,options.size());
    }
}
