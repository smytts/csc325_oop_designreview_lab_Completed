/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList(); // Create an ArrayList of students

        // ToDo 5: Fix the error
        // ToDo 6: Fix the constructor of Student class
        // Todo 7: Create two classes for Freshman and Senior 
        // ToDo 8: The senior class should have a minimum of 85 credits  
        // ToDo 7: Add a toString method for Student class
        // ToDo 9: Add a toString method for Freshman class
        //Student std1 = new Student("James", 20); // create new Student named James age 20 note: error lacking proper parameters
        // ToDo 10: Add a toString method for Senior class
        Freshman std1 = new Freshman("James", 20, 12); // Create new Freshman Student with name: James, age: 20, credits: 12

        Senior std2 = new Senior("John", 30, 90); // Create new Senior Student with name: John, age: 20, credits: 90
        Freshman std3 = new Freshman("Jon", 40, 89);
        System.out.println(std3);

        // Add newly made students to ArrayList
        students.add(std1);
        students.add(std2);

        // ToDo 8: Set the gpa of the student using the scanner and user
        // Iterate through ArrayList of students and set the GPA for each using Scanner
        for (Student s : students) {
            System.out.printf("Enter %s \'s GPA\n", s.getName());
            s.setGpa(scnr.nextDouble());
        }
        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        System.out.println(std1);

        System.out.println(std2);

        // ToDo 9: add comments and explain your code
        // ToDo 12: add comments and explain your code
        // ToDo 10: submit using a pull request.
        // ToDo 13: submit using a pull request.
    }
}
