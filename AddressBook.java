package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static AddinBook book1 = new AddinBook();
    static ArrayList<AddinBook> man1 = new ArrayList<AddinBook>();

    //Created method for adding contact
    public static void addContact(){
        System.out.print("Enter First Name : ");
        String fN = book1.sc.nextLine();
        book1.setFirstName(fN);

        System.out.print("Enter Last Name : ");
        String lN = book1.sc.nextLine();
        book1.setLastName(lN);

        System.out.print("Enter Email-id : ");
        String eId = book1.sc.nextLine();
        book1.setEmail(eId);

        System.out.print("Enter Cell Num : ");
        String cell = book1.sc.nextLine();
        book1.setCellNum(cell);

        System.out.print("Enter City : ");
        String city = book1.sc.nextLine();
        book1.setCity(city);

        System.out.print("Enter Zip : ");
        String zIp = book1.sc.nextLine();
        book1.setZip(zIp);

        System.out.print("Enter Sate : ");
        String state = book1.sc.nextLine();
        book1.setState(state);

        man1.add(book1);
    }
    //Editing Contact
    public static void editContact(){
        System.out.println("Welcome to edit Address Book Program");
        System.out.println("Enter Name for Confirmation : ");
        String name = sc.nextLine();
        for (int i =0; i<man1.size(); i++){
            if(man1.get(i).getFirstName().equalsIgnoreCase(name)){
                man1.remove(i);
                addContact();
                System.out.println("Successfully Edit Data");
            }else {
                System.out.println("No Data Found in Address Book");
            }
        }
    }

    public static void main(String[] args) {
        AddinBook book = new AddinBook();

        System.out.println("##########    Welcome to Address Book Program    ###########");
        System.out.println("1: Add a new Contact to Address Book");
        addContact();
        editContact();
        //printing AddinBook class book1 objet method call
        System.out.println(book1.printString());


    }
}
