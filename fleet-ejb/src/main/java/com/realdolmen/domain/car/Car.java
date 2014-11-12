package com.realdolmen.domain.car;

import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.custompack.CustomPack;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "Car", propOrder = {"id","model", "mileage", "carInUse", "customPack"},namespace = "http://car.domain.realdolmen.com")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CAR_SEQUENCE")
    @SequenceGenerator(name = "CAR_SEQUENCE", sequenceName = "CAR_ID_SEQUENCE", allocationSize = 1)
    private Integer id;

    @ManyToOne(targetEntity = CarModel.class)
    @XmlElement
    private CarModel model;

    @XmlElement
    private Integer mileage;

    @Temporal(TemporalType.DATE)
    @XmlElement
    private Date carInUse;

    @XmlElement
    @OneToOne(targetEntity = CustomPack.class)
    private CustomPack customPack;

    public Car() {
    }

    public Car(CarModel model, Integer mileage, Date carInUse, CustomPack customPack) {
        this.model = model;
        this.mileage = mileage;
        this.carInUse = carInUse;
        this.customPack = customPack;
    }

    public Car(CarModel model, Integer mileage, Date carInUse) {
        this.model = model;
        this.mileage = mileage;
        this.carInUse = carInUse;
    }

    public Integer getId() {
        return id;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Date getCarInUse() {
        return carInUse;
    }

    public void setCarInUse(Date carInUse) {
        this.carInUse = carInUse;
    }

    public CustomPack getCustomPack() {
        return customPack;
    }

    public void setCustomPack(CustomPack customPack) {
        this.customPack = customPack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (carInUse != null ? !carInUse.equals(car.carInUse) : car.carInUse != null) return false;
        if (customPack != null ? !customPack.equals(car.customPack) : car.customPack != null) return false;
        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (mileage != null ? !mileage.equals(car.mileage) : car.mileage != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (carInUse != null ? carInUse.hashCode() : 0);
        result = 31 * result + (customPack != null ? customPack.hashCode() : 0);
        return result;
    }
}
