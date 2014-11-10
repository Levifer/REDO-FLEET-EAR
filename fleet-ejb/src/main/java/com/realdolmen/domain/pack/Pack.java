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
    private Integer id;
    @XmlElement
    private BigDecimal price;
    @XmlElement
    private BigDecimal benefitPrice;
    @XmlElement
    private BigDecimal upgrade;
    @XmlElement
    private BigDecimal downgrade;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PACK_OPTIONS", joinColumns = @JoinColumn(name = "PACK_ID"),
            inverseJoinColumns = @JoinColumn(name = "OPTION_ID"))
    @XmlElementWrapper(name = "options")
    @XmlElement(name = "option",nillable = true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pack pack = (Pack) o;

        if (!benefitPrice.equals(pack.benefitPrice)) return false;
        if (!downgrade.equals(pack.downgrade)) return false;
        if (!id.equals(pack.id)) return false;
        if (!options.equals(pack.options)) return false;
        if (!price.equals(pack.price)) return false;
        if (!upgrade.equals(pack.upgrade)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + benefitPrice.hashCode();
        result = 31 * result + upgrade.hashCode();
        result = 31 * result + downgrade.hashCode();
        result = 31 * result + options.hashCode();
        return result;
    }
}
