package com.simplilearn.models;
import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private String teacherName;
    private List<String> students;

    public Class(String className, String teacherName) {
        this.className = className;
        this.teacherName = teacherName;
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println(studentName + " has been enrolled in the " + className + " class.");
    }

    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println(studentName + " has been removed from the " + className + " class.");
        } else {
            System.out.println(studentName + " is not enrolled in the " + className + " class.");
        }
    }

    public String getClassName() {
        return className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<String> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        
        Class mathClass = new Class("Mathematics", "John Doe");
        mathClass.addStudent("Alice Johnson");
        mathClass.addStudent("Bob Smith");
        mathClass.removeStudent("Charlie Brown");

        System.out.println("Class Name: " + mathClass.getClassName());
        System.out.println("Teacher Name: " + mathClass.getTeacherName());
        System.out.println("Students: " + mathClass.getStudents());
    }
}
