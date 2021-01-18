
package org.launchcode.java.demos.lsn3classes1;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    private int courseCredits;
    private double grade;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.courseCredits = courseCredits;
        this.grade = grade;
        double currentTotal = gpa * numberOfCredits;
        double finalTotal = grade * courseCredits;


        this.numberOfCredits = numberOfCredits + courseCredits;
        this.gpa = finalTotal * numberOfCredits;
    }


    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits < 30) {
            return "Freshman";
        } else {
            if (numberOfCredits > 29) ;
            if (numberOfCredits < 60) {
                return "Sophomore";
            } else {
                if (numberOfCredits > 59) ;
                if (numberOfCredits < 90) {
                    return " Junior";
                } else {
                    return " Senior";
                }
            }
        }
    }
    public String toString(){
        return name + (" Credits = " ) + numberOfCredits + (" GPA = " ) + gpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    //    Student person = new Student("Jennifer", 1,22,4.0);
    public boolean equals( Object Student){

    return true;
    }

}
