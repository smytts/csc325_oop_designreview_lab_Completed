/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * 
 * This class allows for the creation of a Human object.
 * It includes methods for getting and setting the parameters needed to 
 * create a Human object
 * 
 * @author MoaathAlrajab
 */
public abstract class Human {

    private String name;
    private String address;
    private int age;

    // constructor that takes only two paras
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress();

    public abstract void setAddress(String address);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
