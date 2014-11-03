package com.realdolmen.domain.option;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@Table(name ="FLEET_OPTION")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Option {
    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;
    @XmlElement
    private String type;
    @XmlElement
    private String name;
    @XmlElement
    @Column(columnDefinition = "TEXT")
    private String description;
    @XmlElement
    private BigDecimal price;


    public Option() {
    }

    public Option(String type, String name, String description, BigDecimal price) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

}
