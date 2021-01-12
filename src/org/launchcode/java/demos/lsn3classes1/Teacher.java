package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName(){ return this.firstName; }
    public void setFirstName(String afirstName){
        this.firstName = afirstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String alastName){ this.lastName = alastName; }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String asubject){
        this.subject = asubject;
    }
    public int getYearsTeaching(){ return this.yearsTeaching; }
    public void setYearsTeaching(int ayearsTeaching){
        yearsTeaching = ayearsTeaching;
    }
}
