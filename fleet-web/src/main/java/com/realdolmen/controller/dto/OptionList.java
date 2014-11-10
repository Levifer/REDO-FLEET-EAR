package com.realdolmen.controller.dto;

import com.realdolmen.wsdl.carmodel.Option;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BPTAT47 on 10/11/2014.
 */
public class OptionList implements Serializable {

    private List<Option> items = new ArrayList<Option>();

    public List<Option> getItems() {
        return items;
    }

    public void setItems(List<Option> items) {
        this.items = items;
    }
}
