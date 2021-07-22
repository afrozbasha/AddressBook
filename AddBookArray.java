package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Added AddressbookArray class to add an arraylist code in it.
 * Here i modified the access of the Contactlist to protected.
 * Because protected objects can be accessed in inner classes.
 */
public class AddBookArray {
    Scanner sc=new Scanner(System.in);
    protected ArrayList<AddinBook> contactList = new ArrayList<AddinBook>();
    String addressBookName;
}
