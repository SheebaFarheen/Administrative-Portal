package com.simplilearn.models;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	
	
	    private String firstName;
	    private String lastName;
	    private String subject;
	    private List<String> classesTaught;

	    public Teacher(String firstName, String lastName, String subject) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.subject = subject;
	        this.classesTaught = new ArrayList<>();
	    }

	    public void teachClass(String className) {
	        classesTaught.add(className);
	        System.out.println(firstName + " " + lastName + " is teaching the " + className + " class.");
	    }

	    public void conductMeeting(String meetingTopic) {
	        System.out.println(firstName + " " + lastName + " is conducting a meeting on " + meetingTopic + ".");
	    }

	    public void gradePapers() {
	        System.out.println(firstName + " " + lastName + " is grading papers.");
	    }

	    public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public List<String> getClassesTaught() {
	        return classesTaught;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Teacher teacher = new Teacher("John", "Doe", "Math");
	        teacher.teachClass("Algebra");
	        teacher.conductMeeting("Parent-Teacher Conference");
	        teacher.gradePapers();

	        System.out.println("Full Name: " + teacher.getFullName());
	        System.out.println("Subject: " + teacher.getSubject());
	        System.out.println("Classes Taught: " + teacher.getClassesTaught());
	    }
	}
