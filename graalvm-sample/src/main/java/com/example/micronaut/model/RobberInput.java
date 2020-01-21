package com.example.micronaut.model;

import java.util.List;

public class RobberInput {

    public List<Integer> getValueListByHouse() {
        return valueListByHouse;
    }

    public void setValueListByHouse(List<Integer> valueListByHouse) {
        this.valueListByHouse = valueListByHouse;
    }

    List<Integer> valueListByHouse;
}
