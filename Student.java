/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * This class allows for the creation of a Student object which extends from a
 * Human. It includes methods for getting and setting the parameters needed to
 * create a Student object
 *
 * @author MoaathAlrajab/ Timothy
 */
public class Student extends Human {

    private double gpa; // Student's gradepoint average
    private int credits; // Number of credits the student currently has

    // ToDo 1: Make this class a child of Human
    // ToDo 2: Fix the resulting errors
    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Overrides needed either for unqique toString method or carry overs from parent class
    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // ToDo 4: Add comments to your code
    @Override
    public String toString() {
        return "Student: " + super.getName() + "," + super.getAge() + ", {" + "gpa = " + this.gpa + "}";
    }
}
