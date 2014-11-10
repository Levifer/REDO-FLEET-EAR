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
@XmlType(name = "Option", propOrder = {"id","type","name","description","price"})
public class Option {
    @Id
    @GeneratedValue
    @XmlElement(name = "OPTION_ID")
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

    @Override
    public String toString() {
        return "Option{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option = (Option) o;

        if (description != null ? !description.equals(option.description) : option.description != null) return false;
        if (id != null ? !id.equals(option.id) : option.id != null) return false;
        if (name != null ? !name.equals(option.name) : option.name != null) return false;
        if (price != null ? !price.equals(option.price) : option.price != null) return false;
        if (type != null ? !type.equals(option.type) : option.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
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
