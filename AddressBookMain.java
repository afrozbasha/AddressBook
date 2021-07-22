package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Added AddressBookmain class to create object of Main class.
 */
public class AddressBookMain {
    public static void main(String[] args) {
        /*
         * Here i have created Adbook of class AddressBookArray to store multiple addressbooks.
         * According to the options this app will work.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<AddBookArray> adBook = new ArrayList<>();
        String op = "y";
        int opt = 0;
        System.out.println("##########    Welcome to Address Book Program    ###########");
        while (opt != 3){
            System.out.println("1: Add Contact 2: View existing Contacts 3: Exit  Address Book");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Enter the name of address book to be created");
                    String name = sc.next();
                    AddBookArray book = new AddBookArray();
                    book.addressBookName = name;
                    adBook.add(book);
                    break;
                case 2:
                    int key = 0;
                    System.out.println("Enter the address book name to be accessed");
                    String accessBook = sc.next();
                    for (int j = 0; j < adBook.size(); j++) {
                        if (adBook.get(j).addressBookName.equalsIgnoreCase(accessBook)) {
                            int switchChoice = 0;
                            while(switchChoice != 5) {
                                System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
                                System.out.println("Enter choice : ");
                                switchChoice = sc.nextInt();
                                sc.nextLine();
                                op = "y";
                                switch(switchChoice) {
                                    case 1:
                                        while(op.equals("y")) {
                                            System.out.println("Firstname : ");
                                            String firstname = sc.nextLine();
                                            System.out.println("Lastname : ");
                                            String lastname = sc.nextLine();
                                            System.out.println("City : ");
                                            String city = sc.nextLine();
                                            System.out.println("State : ");
                                            String state = sc.nextLine();
                                            System.out.println("Zip : ");
                                            String zip = sc.nextLine();
                                            System.out.println("PhoneNumber : ");
                                            String cell = sc.nextLine();
                                            System.out.println("Email : ");
                                            sc.nextLine();
                                            String email = sc.nextLine();
                                            System.out.println("Do you want add more contact : ");
                                            op = sc.nextLine();

                                            AddinBook contact = new AddinBook(firstname, lastname, email, cell, city, zip, state );
                                            adBook.get(j).contactList.add(contact);
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Enter name of contact to edit : ");
                                        String nameToEdit = sc.nextLine();
                                        int i = 0;
                                        for (i = 0; i < adBook.get(j).contactList.size(); i++) {
                                            if (adBook.get(j).contactList.get(i).getFirstName().equalsIgnoreCase(nameToEdit)) {
                                                adBook.get(j).contactList.get(i).editContact();
                                            }
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Enter name of contact to delete : ");
                                        String deleteCon = sc.nextLine();
                                        for (i = 0; i < adBook.get(j).contactList.size(); i++) {
                                            if (adBook.get(j).contactList.get(i).getFirstName().equalsIgnoreCase(deleteCon)) {
                                                adBook.get(j).contactList.remove(i);
                                            }
                                        }
                                        break;

                                    case 4:
                                        System.out.println("Enter name of contact to view : ");
                                        String nameToView = sc.nextLine();
                                        for (i = 0; i < adBook.get(j).contactList.size(); i++) {
                                            if (adBook.get(j).contactList.get(i).getFirstName().equalsIgnoreCase(nameToView)) {
                                                adBook.get(j).contactList.get(i).printContactDetails();
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }

                        }else{
                            System.out.println("Address Book not found.");
                            System.out.println("Kindly create one Address Book to work.");
                        }
                    }

            }
        }
    }
}

