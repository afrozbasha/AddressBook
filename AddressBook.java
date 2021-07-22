package com.AddressBook;
import java.util.Scanner;

public class AddressBookUC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddinBook book1 = new AddinBook();
        AddressBookArray addArray = new AddressBookArray();
        System.out.println("##########    Welcome to Address Book Program    ###########");
        System.out.println("1: Add a new Contact to Address Book");
        String op = "y";
        while (true){
            System.out.println("1: Add Contact 2: Edit existing contact 3: Delete existing contact 4: View existing Contacts 5: Exit  Address Book");
            System.out.print("Enter Option : ");
            int opt = sc.nextInt();
            sc.nextLine();
            /*
             * Case 1 will add new contact data.
             * Case2 will edit the contact.
             * Case3 will delete the contact data.
             * Case4 will print all the data of that Arraylist.
             * Case5 will exit from this loop.
             */
            switch (opt){
                case 1:
                    while (op.equals("y")){
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

                        System.out.println("Do you want Add more contact : ");
                        op = sc.nextLine();

                        AddressBookArray contact = new AddressBookArray(fN, lN, eId, cell, city, zIp, state);
                        addArray.insertContact(contact);
                    }
                    break;
                case 2:
                    System.out.println("Enter Name of contact to edit : ");
                    String nameToEdit = sc.nextLine();
                    addArray.editContact(nameToEdit);
                    break;
                case 3:
                    System.out.println("Enter Name of contact to Delete : ");
                    String deleteCon = sc.nextLine();
                    addArray.delete(deleteCon);
                    break;
                case 4:
                    System.out.println("Contact List : ");
                    addArray.printContactDetails();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }
}
