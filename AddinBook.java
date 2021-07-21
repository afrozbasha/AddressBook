package com.AddressBook;
import java.util.Scanner;

public class AddinBook {
    Scanner sc = new Scanner(System.in);
    private String firstName, lastName, city, state, zip, cellNum, email;

    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public String getLastName() {
        return lastName;
    }

    public void setCity(String cname) {
        this.city = cname;
    }
    public String getCity() {
        return city;
    }

    public void setZip(String pin) {
        this.zip = pin;
    }
    public String getZip() {
        return zip;
    }

    public void setCellNum(String cell) {
        this.cellNum = cell;
    }
    public String getCellNum() {
        return cellNum;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String printString(){
        return (" First Name: " + getFirstName() + "\n Last Name: " + getLastName() + "\n Cell Num: " + getCellNum() + "\n Email-id: " + getEmail() + "\n City: " + getCity() + " \n Pin: " + getZip() + "\n State: " + getState());
    }
}



