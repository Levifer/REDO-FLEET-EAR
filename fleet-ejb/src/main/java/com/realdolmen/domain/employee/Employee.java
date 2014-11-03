package com.realdolmen.domain.employee;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.car.Car;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Employee {

    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;
    @XmlElement
    private String name;
    @XmlElement
    private String surname;
    @XmlElement
    private String email;
    @XmlElement
    private String password;
    @XmlElement
    private String employeeNumber;
    @XmlElement
    private Integer category;
    @OneToMany
    @XmlElement
    private List<Car> cars;
    @Enumerated(EnumType.STRING)
    @XmlElement
    private Enums.Roles roles;
    @Enumerated(EnumType.STRING)
    @XmlElement
    private Enums.Status status;

    public Employee() {
    }

    public Employee(String name, String surname, String email, String password, String employeeNumber, Integer category,Enums.Roles roles, Enums.Status status) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.employeeNumber = employeeNumber;
        this.category = category;
        this.roles = roles;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Enums.Roles getRoles() {
        return roles;
    }

    public void setRoles(Enums.Roles roles) {
        this.roles = roles;
    }

    public Enums.Status getStatus() {
        return status;
    }

    public void setStatus(Enums.Status status) {
        this.status = status;
    }
}
