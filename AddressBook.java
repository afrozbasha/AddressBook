package com.AddressBook;
import java.util.*;


public class AddressBook {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddinBook book1 = new AddinBook();
        ArrayList<String> man1 = new ArrayList<String>();


        System.out.println("Add a new Contact to Address Book");

        System.out.print("Enter First Name : ");
        String fN = book1.sc.nextLine();
        book1.setFirstName(fN);
        man1.add(0, book1.getFirstName());


        System.out.print("Enter Last Name : ");
        String lN = book1.sc.nextLine();
        book1.setLastName(lN);
        man1.add(1, book1.getLastName());

        System.out.print("Enter Email-id : ");
        String eId = book1.sc.nextLine();
        book1.setEmail(eId);
        man1.add(2, book1.getEmail());

        System.out.print("Enter Cell Num : ");
        String cell = book1.sc.nextLine();
        book1.setCellNum(cell);
        man1.add(3, book1.getCellNum());

        System.out.print("Enter City : ");
        String city = book1.sc.nextLine();
        book1.setCity(city);
        man1.add(4, book1.getCity());

        System.out.print("Enter Zip : ");
        String zIp = book1.sc.nextLine();
        book1.setZip(zIp);
        man1.add(5, book1.getZip());

        System.out.print("Enter Sate : ");
        String state = book1.sc.nextLine();
        book1.setState(state);
        man1.add(6, book1.getState());

        System.out.println(man1);

        System.out.println(" First Name: "+man1.get(0)+"\n Last Name: "+man1.get(1)+"\n Cell Num: "+man1.get(2)+"\n Email-id: "+man1.get(3)+"\n City: "+man1.get(4)+" \n Pin: "+man1.get(5)+"\n State: "+man1.get(6));


    }
}

