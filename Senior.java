/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyofassignment7;

/**
 *
 * This class allows for the creation of a Senior object which extends from a
 * Student. It includes methods for getting and setting the parameters needed to
 * create a Senior object
 *
 * @author Timothy
 */
public class Senior extends Student {

    public Senior(String name, int age, int credits) {
        super(name, age, credits);

        /* Conditional statement put to ensure student's credits are properly
        correlated to student's year status.
         */
        if (credits >= 85) {
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
        if (credits >= 85) {
            super.setCredits(credits);
        } else {
            System.out.println("Error with credits");
        }
    }

    // Overrides needed either for unqique toString method
    @Override
    public String toString() {
        if (super.getCredits() >= 85) {
            return "Senior: " + "name: " + super.getName() + ", age: " + super.getAge() + ", number of credits: " + super.getCredits() + ", GPA: " + super.getGpa();
        }
        return super.getName() + " does not have enough credits to be a senior (85 credits minimum)";
    }
}
