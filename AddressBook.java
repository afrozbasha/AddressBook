package com.AddressBook;
import java.util.Scanner;


public class AddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddinBook b = new AddinBook();
        System.out.println("Welcome to Address Book Program");

        System.out.print("Enter First Name : ");
        b.setFirstName(sc.nextLine());
        System.out.print("Enter Last Name : ");
        b.setLastName(sc.nextLine());
        System.out.print("Enter Cell Num : ");
        b.setCellNum(sc.nextLine());
        System.out.print("Enter Email-id : ");
        b.setEmail(sc.nextLine());
        System.out.print("Enter City : ");
        b.setCity(sc.nextLine());
        System.out.print("Enter State : ");
        b.setState(sc.nextLine());
        System.out.print("Enter Zpin : ");
        b.setZip(sc.nextLine());
        System.out.println();

        System.out.println(" First Name: "+b.getFirstName()+"\n Last Name: "+b.getLastName()+"\n Cell Num: "+b.getCellNum()+"\n Email-id: "+b.getEmail()+"\n City: "+b.getCity()+" \n Pin: "+b.getZip()+"\n State: "+b.getState());

    }
}
