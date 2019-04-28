package com.tj.pizzastore02.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {

    public String name;
    public String openTime;
    public String phoneNum;
    public String logoUrl;

    public PizzaStore(String name, String openTime, String phoneNum, String logoUrl) {
        this.name = name;
        this.openTime = openTime;
        this.phoneNum = phoneNum;
        this.logoUrl = logoUrl;
    }
}
