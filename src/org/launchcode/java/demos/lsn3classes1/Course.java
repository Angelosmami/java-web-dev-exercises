package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {
    //Student student = new Student("Jen",1,4.0);

    private String name;
    private int numberOfCredits;
    private ArrayList<Student> students;

    public String toString(){
        return name + " Number Of Credits " + numberOfCredits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfCredits);
    }

    public boolean equals (Object Student){
     return true;
    }


}
