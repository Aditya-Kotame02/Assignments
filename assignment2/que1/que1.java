package com.sunbeam.Assignments.assignment2.que1;

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int choice, qty;

        while (true) {
            System.out.println("Food Menu !!");
            System.out.println("0. Exit!!");
            System.out.println("1. Dosa => 40 Rs");
            System.out.println("2. Samosa => 20 Rs");
            System.out.println("3. Idli => 30 Rs");
            System.out.println("4. VadaPav => 15 Rs");
            System.out.println("5. Missal => 80 RS");
            System.out.println("6. Pattie => 20 Rs");
            System.out.println("7. Fruit Plate => 40 Rs");
            System.out.println("8. Tea => 15 Rs");
            System.out.println("9. Coffee => 25 Rs");
            System.out.println("10. Generate Bill");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 10) {
                System.out.println("Total Bill: Rs." + total);
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 40;
                    break;
                case 2:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 20;
                    break;
                case 3:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 30;
                    break;
                case 4:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 15;
                    break;
                case 5:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 80;
                    break;
                case 6:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 20;
                    break;
                case 7:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 40;
                    break;
                case 8:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 15;
                    break;
                case 9:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 25;
                    break;
                default:
                    System.out.println("Wrong choice ... :(");
                    break;
            }
        }
    }
}
