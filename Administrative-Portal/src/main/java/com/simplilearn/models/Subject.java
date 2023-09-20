package com.simplilearn.models;

public class Subject {
    private String subjectCode;
    private String subjectName;
    private int creditHours;

    public Subject(String subjectCode, String subjectName, int creditHours) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = creditHours;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Subject Code: " + subjectCode +
                "\nSubject Name: " + subjectName +
                "\nCredit Hours: " + creditHours;
    }

    public static void main(String[] args) {
        
        Subject mathSubject = new Subject("MATH101", "Mathematics", 3);
        System.out.println("Subject Information:\n" + mathSubject);
    }
}
