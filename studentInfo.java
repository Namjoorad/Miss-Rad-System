package com.example.mashreghi.rad;

public class studentInfo {

    public studentInfo() {
    }

    public studentInfo(String name, String family, int idNumber) {
        Name = name;
        Family = family;
        this.idNumber = idNumber;
    }

    String Name,Family;
    int idNumber;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
