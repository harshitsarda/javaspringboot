package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("macbook")
public class Laptop {
    private String brand;
    private int price;

    public Laptop() {
        System.out.println("Laptop object created....");
    }

    public void compile() {
        System.out.println("compiling....");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
