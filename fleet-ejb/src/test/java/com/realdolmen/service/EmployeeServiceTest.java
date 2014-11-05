package com.realdolmen.service;

import com.realdolmen.domain.employee.EmployeeRepository;
import com.realdolmen.domain.employee.EmployeeWebService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by TLAAU71 on 5/11/2014.
 */
@Ignore
public class EmployeeServiceTest{

    @InjectMocks
    private EmployeeWebService employeeWebService;

    @Mock
    private EmployeeRepository employeeRepository;


    @Test
    public void testFindById() throws Exception {
        employeeWebService.findEmployeeById(1);
        verify(employeeRepository,times(1)).find(1);
    }

    @Test
    public void testFindByName() throws Exception {
        employeeWebService.findEmployeeByName("Lemahieu");
        verify(employeeRepository,times(1)).findByName("Lemahieu");

    }

    @Test
    public void testFindBySurname() throws Exception {
        employeeWebService.findEmployeeBySurname("Tim");
        verify(employeeRepository,times(1)).findBySurname("Tim");
    }

    @Test
    public void testFindByEmployeeNumber() throws Exception {
        employeeWebService.findEmployeeByEmployeeNumber("AAU71");
        verify(employeeRepository,times(1)).findByEmployeeNumber("AAU71");
    }

    @Test
    public void testFindByEmail() throws Exception {
        employeeWebService.findEmployeeByEmail("tim.lemahieu@realdolmen.Com");
        verify(employeeRepository,times(1)).findByEmail("tim.lemahieu@realdolmen.Com");
    }
}
