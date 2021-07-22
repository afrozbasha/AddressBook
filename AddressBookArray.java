package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class AddressBookArray {
    static Scanner sc = new Scanner(System.in);
    static List<AddinBook> contactList = new ArrayList<>();

    //Created method for adding contact
    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String fN = sc.nextLine();

        System.out.print("Enter Last Name : ");
        String lN = sc.nextLine();

        System.out.print("Enter Email-id : ");
        String eId = sc.nextLine();

        System.out.print("Enter Cell Num : ");
        String cell = sc.nextLine();

        System.out.print("Enter City : ");
        String city = sc.nextLine();

        System.out.print("Enter Zip : ");
        String zIp = sc.nextLine();

        System.out.print("Enter Sate : ");
        String state = sc.nextLine();


        AddinBook contact = new AddinBook(fN, lN, eId, cell, city, zIp, state);
        contactList.add(contact);
    }

    //Created method for editing contact details
    public void editContact(String nameToEdit) {
        System.out.println("Edit Firstname : ");
        String firstname = sc.nextLine();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equalsIgnoreCase(firstname)) {
                contactList.remove(i);
                addContact();
            } else {
                System.out.println("Contact not found!!!");
            }
        }
    }

    //Creating deleteContact() for deleting contact details using first name
    public void delete(String nameToDelete) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(nameToDelete)) {
                contactList.remove(i);
                System.out.println("Contact is Deleted");
            } else {
                System.out.println("Contact not found!!!");
            }
        }
    }

    //Adding Multiple persons i.e contacts in address book
    public static void addPersons() {
        System.out.println("Enter number of persons wanted to in address book : ");
        Scanner sc = new Scanner(System.in);
        int noOfPersons = sc.nextInt();
        int count = 1;
        while (count <= noOfPersons) {
            addContact();
            count++;
        }
    }

    public static void main(String[] args) {
        AddinBook book = new AddinBook();
        System.out.println("##########    Welcome to Address Book Program    ###########");
        addPersons();
        System.out.println(contactList);
    }
}








