package com.realdolmen.domain.employee;

import com.realdolmen.domain.AbstractRepository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Stateless
public class EmployeeRepository extends AbstractRepository<Employee> {


    public List<Employee> findByName(String name){
        return entityManager.createQuery("Select e from employee e where e.name like :name",Employee.class)
                .setParameter("name","%"+name+"%")
                .getResultList();
    }

    public List<Employee> findBySurname(String surname){
        return entityManager.createQuery("Select e from employee e where e.surname like :surname",Employee.class)
                .setParameter("surname","%"+surname+"%")
                .getResultList();
    }

    public Employee findByEmployeeNumber(String employeeNumber) {
        List<Employee> list = entityManager.createQuery("Select e from employee e where e.employeeNumber = :employeeNumber", Employee.class)
                .setParameter("employeeNumber", employeeNumber)
                .getResultList();
        return list.get(0);
    }

    public Employee findByEmail(String email) {
        List<Employee> list = entityManager.createQuery("Select e from employee e where e.employeeNumber = :email", Employee.class)
                .setParameter("email", email)
                .getResultList();
        return list.get(0);
    }
}
