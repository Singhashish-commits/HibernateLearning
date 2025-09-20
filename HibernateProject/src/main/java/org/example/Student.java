package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "studenttable")
public class Student {
//    @Id
//    @Column(name = "roll")
    private int roll;
//@Column(name = "name")
    private String sName;
//@Column(name = "age")
    private int age;
    public Student(){
        //Empty constructor
    }
//    @Transient it prevents a field from being persist in the database
    public Student(int roll, String sName, int age) {
        this.roll = roll;
        this.sName = sName;
        this.age = age;
    }


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getSage() {
        return age;
    }

    public void setSage(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student {"+"roll="+roll+", sName="+sName+", age="+age+"}";

    }



}
