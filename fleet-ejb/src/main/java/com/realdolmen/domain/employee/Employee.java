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
@XmlType(name = "Employee", propOrder = {"id","name","surname","email","password","employeeNumber","category","cars","roles","status"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EMPLOYEE_SEQUENCE")
    @SequenceGenerator(name = "EMPLOYEE_SEQUENCE", sequenceName = "EMPLOYEE_SEQUENCE_ID_SEQUENCE", allocationSize = 1)
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
    @OneToMany(targetEntity = Car.class)
    @XmlElementWrapper(name = "cars")
    @XmlElement(name = "car")
    private List<Car> cars;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @XmlElementWrapper(name = "roles")
    @XmlElement(name="role")
    private List<Enums.Roles> roles;
    @Enumerated(EnumType.STRING)
    @XmlElement
    private Enums.Status status;
    @XmlTransient
    private  boolean enabled = true;

    public Employee() {
    }

    public Employee(String name, String surname, String email, String password, String employeeNumber, Integer category,List<Enums.Roles> roles, Enums.Status status) {
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

    public List<Enums.Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Enums.Roles> roles) {
        this.roles = roles;
    }

    public Enums.Status getStatus() {
        return status;
    }

    public void setStatus(Enums.Status status) {
        this.status = status;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (enabled != employee.enabled) return false;
        if (cars != null ? !cars.equals(employee.cars) : employee.cars != null) return false;
        if (category != null ? !category.equals(employee.category) : employee.category != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (employeeNumber != null ? !employeeNumber.equals(employee.employeeNumber) : employee.employeeNumber != null)
            return false;
        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (password != null ? !password.equals(employee.password) : employee.password != null) return false;
        if (roles != null ? !roles.equals(employee.roles) : employee.roles != null) return false;
        if (status != employee.status) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (employeeNumber != null ? employeeNumber.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (cars != null ? cars.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (enabled ? 1 : 0);
        return result;
    }
}
