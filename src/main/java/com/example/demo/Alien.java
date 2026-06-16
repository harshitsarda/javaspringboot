package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String aname;
    private String tech;
    @Autowired
    @Qualifier("macbook")
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien object created....");
    }

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getTech() {
        return tech;
    }

    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + "]";
    }

    public void show() {
        System.out.println("hello alien");
        laptop.compile();
    }

}
