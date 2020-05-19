package com.example.mashreghi.rad.model;

import javax.sql.StatementEvent;

public class Student {

    String stunumber;
    String name;
    String family;


    public Student() {
    }

    public Student(String stunumber, String name, String family) {
        this.stunumber = stunumber;
        this.name = name;
        this.family = family;
    }

    public String getStunumber() {
        return stunumber;
    }

    public void setStunumber(String stunumber) {
        this.stunumber = stunumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
