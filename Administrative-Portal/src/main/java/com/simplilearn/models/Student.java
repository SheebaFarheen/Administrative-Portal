package com.simplilearn.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> enrolledClasses;

    public Student(String studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolledClasses = new ArrayList<>();
    }

    public void enrollInClass(String className) {
        enrolledClasses.add(className);
        System.out.println(firstName + " " + lastName + " has been enrolled in the " + className + " class.");
    }

    public void dropFromClass(String className) {
        if (enrolledClasses.remove(className)) {
            System.out.println(firstName + " " + lastName + " has been dropped from the " + className + " class.");
        } else {
            System.out.println(firstName + " " + lastName + " is not enrolled in the " + className + " class.");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getEnrolledClasses() {
        return enrolledClasses;
    }

    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student("S12345", "Alice", "Johnson", 18);
        student1.enrollInClass("Mathematics");
        student1.enrollInClass("History");
        student1.dropFromClass("History");

        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Full Name: " + student1.getFullName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Enrolled Classes: " + student1.getEnrolledClasses());
    }
}
