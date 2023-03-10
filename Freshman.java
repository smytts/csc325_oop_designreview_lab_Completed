/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyofassignment7;

/**
 *
 * This class allows for the creation of a Freshman object which extends from a
 * Student. It includes methods for getting and setting the parameters needed to
 * create a Freshman object
 *
 * @author Timothy
 */
public class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        super(name, age, credits);

        /* Conditional statement put to ensure student's credits are properly
        correlated to student's year status.
         */
        if (credits >= 0 && credits < 85) {
            super.setCredits(credits);
        } else {
            System.out.println("Error with credits");
        }
    }

    // Method to overide setCredits with conditional statement included
    @Override
    public void setCredits(int credits) {
        /* Conditional statement put to ensure student's credits are properly
        correlated to student's year status.
         */
        if (credits >= 0 && credits < 85) {
            super.setCredits(credits);
        } else {
            System.out.println("Error with credits");
        }
    }

    // Overrides needed either for unqique toString method
    @Override
    public String toString() {
        if (super.getCredits() >= 0 && super.getCredits() < 85) {
            return "Freshman: " + "name: " + super.getName() + ", age: " + super.getAge() + ", number of credits: " + super.getCredits() + ", GPA: " + super.getGpa();
        } else {
            return super.getName() + " has too many credits to be classified as a freshman.";
        }
    }
}
