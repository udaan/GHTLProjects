package com.ghtl.online.shop;

/**
 * Created by GHTL on 09/02/2017.
 */
public class DemoClass {
    private String name;

    public void printHello() {
        System.out.println("Hello World from " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
