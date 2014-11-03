package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.pack.Pack;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@NamedQueries(
        {
           @NamedQuery(name = "CarModel.findAllByBrand",query = "SELECT c FROM CarModel c WHERE c.brand =:brand")
        }
)
public class CarModel {
    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;
    @XmlElement
    private String brand;
    @XmlElement
    private String type;
    @XmlElement
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

    @OneToOne(fetch = FetchType.EAGER)
    @XmlElement
    private Pack pack;


    public CarModel() {
    }

    public CarModel(String brand, String type, Enums.Fuel fuelType, Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category, String imageUrl, Pack pack) {
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

    public CarModel(String brand, String type, Enums.Fuel fuelType, Date year, int quarter, Pack pack, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category) {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
