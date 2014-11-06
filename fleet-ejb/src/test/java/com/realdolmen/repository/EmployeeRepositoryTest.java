package com.realdolmen.repository;

import com.realdolmen.ImportPersistenceTest;
import com.realdolmen.domain.Enums;
import com.realdolmen.domain.employee.Employee;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class EmployeeRepositoryTest extends ImportPersistenceTest{
    private Employee employee;

    @Before
    public void Setup(){
        employee = new Employee("Lemahieu","Tim","tim.lemahieu@realdolmen.com","azerty","AAU71",2, Enums.Roles.EMPLOYEE, Enums.Status.APPROVED);
    }
    @Test
    public void testPersistEmployee() throws Exception {
        em().persist(employee);
        assertNotNull(employee.getId());
    }

    @Test
    public void testRemoveEmployee() throws Exception {
        em().remove(employee);
        assertNull(employee.getId());
    }

    @Test
    public void testRetrieveEmployee() throws Exception {
        Employee employee = em().getReference(Employee.class, 11);
        assertNotNull(employee.getName());
    }

    @Test
    public void testUpdateEmployee() throws Exception {
        Employee employee = em().getReference(Employee.class, 13);
        assertEquals("Tim",employee.getName());
        employee.setName("Timmy");
        em().merge(employee);
        assertEquals("Timmy",employee.getName());
    }

    @Test
    public void testFindAllEmployees() throws Exception {
        List resultList = em().createQuery("SELECT e from Employee e",Employee.class).getResultList();
        assertTrue(resultList.size() >=0);
    }
}
