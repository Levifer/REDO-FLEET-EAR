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
public class Car implements Serializable {

    @Id
    @GeneratedValue
    @XmlTransient
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
}
