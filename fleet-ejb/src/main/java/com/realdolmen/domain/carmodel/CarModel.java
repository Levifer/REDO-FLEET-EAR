package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.pack.Pack;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@NamedQueries(
    {
        @NamedQuery(name = "CarModel.findAllByBrand",query = "SELECT c FROM CarModel c WHERE c.brand =:brand"),
        @NamedQuery(name = "CarModel.findAllByType",query = "SELECT c FROM CarModel c WHERE c.type =:type")
    }
)
@XmlType(name = "CarModel",propOrder = {"id","brand","name","type","fuelType","year","quarter","minKm","maxKm","deliveryTime","fiscalHp","co2","category","imageUrl","pack"},namespace = "http://carmodel.domain.realdolmen.com/")
public class CarModel {
    @Id
    @GeneratedValue
    private Integer id;
    @XmlElement
    private String brand;
    @XmlElement
    private String name;
    @XmlElement
    @Enumerated(EnumType.STRING)
    private Enums.CarType type;
    @XmlElement
    @Enumerated(EnumType.STRING)
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

    @OneToOne(targetEntity = Pack.class)
    @XmlElement
    private Pack pack;


    public CarModel() {
    }

    public CarModel(String brand, String name, Enums.CarType type, Enums.Fuel fuelType, Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category, String imageUrl, Pack pack) {
        this.brand = brand;
        this.name = name;
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

    public CarModel(String brand, String name, Enums.CarType type, Enums.Fuel fuelType, Date year, int quarter, Pack pack, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category) {
        this.brand = brand;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarModel carModel = (CarModel) o;

        if (category != carModel.category) return false;
        if (co2 != carModel.co2) return false;
        if (deliveryTime != carModel.deliveryTime) return false;
        if (fiscalHp != carModel.fiscalHp) return false;
        if (maxKm != carModel.maxKm) return false;
        if (minKm != carModel.minKm) return false;
        if (quarter != carModel.quarter) return false;
        if (brand != null ? !brand.equals(carModel.brand) : carModel.brand != null) return false;
        if (fuelType != carModel.fuelType) return false;
        if (!id.equals(carModel.id)) return false;
        if (imageUrl != null ? !imageUrl.equals(carModel.imageUrl) : carModel.imageUrl != null) return false;
        if (pack != null ? !pack.equals(carModel.pack) : carModel.pack != null) return false;
        if (type != null ? !type.equals(carModel.type) : carModel.type != null) return false;
        if (year != null ? !year.equals(carModel.year) : carModel.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + quarter;
        result = 31 * result + minKm;
        result = 31 * result + maxKm;
        result = 31 * result + deliveryTime;
        result = 31 * result + fiscalHp;
        result = 31 * result + co2;
        result = 31 * result + category;
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (pack != null ? pack.hashCode() : 0);
        return result;
    }
}
