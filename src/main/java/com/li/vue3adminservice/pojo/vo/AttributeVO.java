package com.li.vue3adminservice.pojo.vo;

import com.li.vue3adminservice.pojo.AttributeValue;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class AttributeVO {
    private Long id;
    private String name;
    private Integer type;
    private List<AttributeValue> values = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<AttributeValue> getValues() {
        return values;
    }

    public void setValues(List<AttributeValue> values) {
        this.values = values;
    }
}