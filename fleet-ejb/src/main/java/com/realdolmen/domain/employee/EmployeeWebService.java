package com.realdolmen.domain.employee;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@WebService
@Stateless
public class EmployeeWebService {

    @Inject
    private EmployeeRepository employeeRepository;

    @WebMethod(action = "createEmployee")
    public void createEmployee(@WebParam(name = "employee")Employee employee){
        employeeRepository.persist(employee);
    }

    @WebResult(name = "employee")
    @WebMethod(action = "findEmployeeById")
    public Employee findEmployeeById(@WebParam(name = "id")Integer id) {
        return employeeRepository.find(id);
    }
    @WebResult(name = "employees")
    @WebMethod(action = "findEmployeeByName")
    public List<Employee> findEmployeeByName(@WebParam(name = "name") String name) {
        return employeeRepository.findByName(name);
    }

    @WebResult(name = "employees")
    @WebMethod(action = "findEmployeeBySurname")
    public List<Employee> findEmployeeBySurname(@WebParam(name = "surname") String surname) {
        return employeeRepository.findByName(surname);
    }

    @WebResult(name = "employee")
    @WebMethod(action = "findEmployeeByEmployeeNumber")
    public Employee findEmployeeByEmployeeNumber(@WebParam(name = "employeeNumber") String employeeNumber) {
        return employeeRepository.findByEmployeeNumber(employeeNumber);
    }

    @WebResult(name = "employee")
    @WebMethod(action = "findEmployeeByEmail")
    public Employee findEmployeeByEmail(@WebParam(name = "email") String email) {
        return employeeRepository.findByEmail(email);
    }
}
