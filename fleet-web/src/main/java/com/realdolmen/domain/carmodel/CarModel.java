package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.car.Car;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class CarModel {
    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;
    @XmlElement
    @Enumerated
    private Enums.Brand brand;
    @XmlElement
    @Enumerated
    private Enums.CarType type;
    @XmlElement
    @Enumerated
    private Enums.Fuel fuelType;
    @Temporal(TemporalType.DATE)
    @XmlElement
    private Date year;
    @XmlElement
    private int quarter;
    @XmlElement
    private int minKm;
    @XmlElement
    private int maxKm;
    @XmlElement
    private int deliveryTime;
    @XmlElement
    private int fiscalHp;
    @XmlElement
    private int co2;
    @XmlElement
    private int category;
    @XmlElement
    private String imageUrl;

    @OneToOne
    @XmlElement
    private Pack pack;


    public CarModel() {
    }

    public CarModel(Enums.Brand brand, Enums.CarType type, Enums.Fuel fuelType, Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category, String imageUrl, Pack pack) {
        this.brand = brand;
        this.type = type;
        this.fuelType = fuelType;
        this.year = year;
        this.quarter = quarter;
        this.minKm = minKm;
        this.maxKm = maxKm;
        this.deliveryTime = deliveryTime;
        this.fiscalHp = fiscalHp;
        this.co2 = co2;
        this.category = category;
        this.imageUrl = imageUrl;
        this.pack = pack;
    }

    public CarModel(Enums.Brand brand, Enums.CarType type, Enums.Fuel fuelType, Date year, int quarter, Pack pack, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category) {
        this.brand = brand;
        this.type = type;
        this.fuelType = fuelType;
        this.year = year;
        this.quarter = quarter;
        this.pack = pack;
        this.minKm = minKm;
        this.maxKm = maxKm;
        this.deliveryTime = deliveryTime;
        this.fiscalHp = fiscalHp;
        this.co2 = co2;
        this.category = category;
    }

    public Enums.Brand getBrand() {
        return brand;
    }

    public void setBrand(Enums.Brand brand) {
        this.brand = brand;
    }

    public Enums.CarType getType() {
        return type;
    }

    public void setType(Enums.CarType type) {
        this.type = type;
    }

    public Enums.Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Enums.Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public int getMinKm() {
        return minKm;
    }

    public void setMinKm(int minKm) {
        this.minKm = minKm;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getFiscalHp() {
        return fiscalHp;
    }

    public void setFiscalHp(int fiscalHp) {
        this.fiscalHp = fiscalHp;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
