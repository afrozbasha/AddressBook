package com.AddressBook;
import java.util.Scanner;

public class AddinBook {
    Scanner sc = new Scanner(System.in);
    private String firstName, lastName, city, state, zip, cellNum, email;

    public AddinBook(){
    }


    public AddinBook(String fN, String lN, String eId, String cell, String city, String zIp, String state) {
        this.firstName = fN;
        this.lastName = lN;
        this.city = city;
        this.state = state;
        this.zip = zIp;
        this.cellNum = cell;
        this.email = eId;
    }

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
    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edit Firstname : ");
        String firstname = sc.nextLine();
        setFirstName(firstname);

        System.out.println("Edit Lastname : ");
        String lastname = sc.nextLine();
        setLastName(lastname);


        System.out.println("Edit City : ");
        String city = sc.nextLine();
        setCity(city);

        System.out.println("Edit State : ");
        String state = sc.nextLine();
        setState(state);

        System.out.println("Edit Zip : ");
        String zip = sc.nextLine();
        setZip(zip);

        System.out.println("Edit PhoneNumber : ");
        String cellNum = sc.nextLine();
        setCellNum(cellNum);

        System.out.println("Edit Email : ");
        String email = sc.nextLine();
        setEmail(email);
    }
    public void printContactDetails() {
        System.out.println("Firstname : " + getFirstName());
        System.out.println("Lastname : " + getLastName());
        System.out.println("City : " + getCity());
        System.out.println("State : " + getState());
        System.out.println("Zip : " + getZip());
        System.out.println("PhoneNumber : " + getCellNum());
        System.out.println("Email : " + getEmail());

    }

}



