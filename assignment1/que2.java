package com.sunbeam.Assignments.assignment1;

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.print("Enter First Double Number: ");
        if(sc.hasNextDouble()){
            num1 = sc.nextDouble();
        }else{
            System.out.println("Error The Number Is Not A Valid Double");
            return;
        }
        System.out.print("Enter Second Double Number: ");
        if(sc.hasNextDouble()){
            num2 = sc.nextDouble();
        }else {
            System.out.println("Error The Number Is Not A Valid Double");
            return;
        }
        double average = (num1 + num2)/2;
        System.out.println("Average Of Two Double Number Is: "+average);
    }
}
