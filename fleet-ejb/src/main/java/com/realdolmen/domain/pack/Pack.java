package com.realdolmen.domain.pack;

import com.realdolmen.domain.option.Option;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Pack {
    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;
    @XmlElement
    private BigDecimal price;
    @XmlElement
    private BigDecimal benefitPrice;
    @XmlElement
    private BigDecimal upgrade;
    @XmlElement
    private BigDecimal downgrade;

    @ManyToMany()
    @XmlElement(nillable = true)
    private List<Option> options;

    public Pack() {
    }

    public Pack(Pack pack, List<Option> options){
        this.price = pack.price;
        this.benefitPrice = pack.benefitPrice;
        this.upgrade = pack.upgrade;
        this.downgrade = pack.downgrade;
        this.options = pack.options;
        for (Option option : options) {
            this.options.add(option);
        }
    }

    public Pack(BigDecimal price, BigDecimal benefitPrice, BigDecimal upgrade, BigDecimal downgrade, List<Option> options) {
        this.price = price;
        this.benefitPrice = benefitPrice;
        this.upgrade = upgrade;
        this.downgrade = downgrade;
        this.options = options;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBenefitPrice() {
        return benefitPrice;
    }

    public void setBenefitPrice(BigDecimal benefitPrice) {
        this.benefitPrice = benefitPrice;
    }

    public BigDecimal getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(BigDecimal upgrade) {
        this.upgrade = upgrade;
    }

    public BigDecimal getDowngrade() {
        return downgrade;
    }

    public void setDowngrade(BigDecimal downgrade) {
        this.downgrade = downgrade;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

}
