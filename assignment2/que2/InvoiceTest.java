package com.sunbeam.Assignments.assignment2.que2;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        invoice invoice1 = new invoice("1A5cE","Nails",15,10.43);
        System.out.println("Enter Part Number: "+invoice1.getPartnum());
        System.out.println("Enter Description Of Part: "+invoice1.getPartDescription());
        System.out.println("Enter Quantity Of Part: "+invoice1.getQuantity());
        System.out.println("Enter Price Of Part: "+invoice1.getPrice());
        System.out.println("Your Total Amount Is: "+invoice1.getInvoice());

        System.out.println("\n------------------------------------------------------------\n");
        invoice invoice2 = new invoice("D56Tef","Paint Brush",4,145.66);
        System.out.println("Enter Part Number: "+invoice2.getPartnum());
        System.out.println("Enter Description Of Part: "+invoice2.getPartDescription());
        System.out.println("Enter Quantity Of Part: "+invoice2.getQuantity());
        System.out.println("Enter Price Of Part: "+invoice2.getPrice());
        System.out.println("Your Total Amount Is: "+invoice2.getInvoice());

    }
}
