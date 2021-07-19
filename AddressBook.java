package com.AddressBook;
import java.util.Scanner;


public class AddressBook {
    public static void main(String[] args) {
        AddinBook b = new AddinBook();
        System.out.println("Welcome to Address Book Program");

        b.setFirstName("Afroz");
        b.setLastName("Basha");
        b.setCellNum("95xx605");
        b.setEmail("afrozxx@gmail.com");
        b.setCity("jammalamadugu");
        b.setZip("516434");
        b.setState("Andhra Pradesh");

        System.out.println(" First Name: "+b.getFirstName()+"\n Last Name: "+b.getLastName()+"\n Cell Num: "+b.getCellNum()+"\n Email-id: "+b.getEmail()+"\n City: "+b.getCity()+" \n Pin: "+b.getZip()+"\n State: "+b.getState());

    }
}
