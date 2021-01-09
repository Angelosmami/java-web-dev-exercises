package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName(){
        return firstName;
    }
    void setFirstName(String afirstName){
        firstName = afirstName;
    }
    public String getLastName(){
        return lastName;
    }
    void setLastName(String alastName){
        lastName = alastName;
    }
    public String getSubject(){
        return subject;
    }
    void setSubject(String asubject){
        subject = asubject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }
    void setYearsTeaching(int ayearsTeaching){
        yearsTeaching = ayearsTeaching;
    }
}
