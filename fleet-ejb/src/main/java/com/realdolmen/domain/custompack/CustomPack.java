package com.realdolmen.domain.custompack;

import com.realdolmen.domain.option.Option;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "CustomPack", propOrder = {"id","options"})
public class CustomPack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CUSTOMPACK_SEQUENCE")
    @SequenceGenerator(name = "CUSTOMPACK_SEQUENCE", sequenceName = "CUSTOMPACK_ID_SEQUENCE", allocationSize = 1)
    private Integer id;
    @OneToMany(targetEntity = Option.class)
    @XmlElementWrapper(name = "options")
    @XmlElement(name = "option")
    private List<Option> options;

    public CustomPack() {
    }

    public CustomPack(List<Option> options) {
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomPack that = (CustomPack) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        return result;
    }
}
