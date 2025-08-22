package com.sunbeam.Assignments.assignment1;

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        System.out.println("java Test");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Given Number: "+num);
        System.out.println("Binary equivalent: "+Integer.toBinaryString(num));
        System.out.println("Hexadecimal equivalent: "+Integer.toHexString(num));
        System.out.println("Octal equivalent: "+Integer.toOctalString(num));
    }
}
