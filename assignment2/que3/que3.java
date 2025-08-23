package com.sunbeam.Assignments.assignment2.que3;

import java.util.Scanner;

public class que3 {
    private double miles;
    private double gallonCost;
    private double average;
    private double parkFees;
    private int tolls;

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGallonCost() {
        return gallonCost;
    }

    public void setGallonCost(double gallonCost) {
        this.gallonCost = gallonCost;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getParkFees() {
        return parkFees;
    }

    public void setParkFees(double parkFees) {
        this.parkFees = parkFees;
    }

    public int getTolls() {
        return tolls;
    }

    public void setTolls(int tolls) {
        this.tolls = tolls;
    }

    public void acceptDetails(Scanner sc){
        System.out.print("Total miles driven per day: ");
        this.miles = sc.nextDouble();
        System.out.print("Cost per gallon of gasoline: ");
        this.gallonCost = sc.nextDouble();
        System.out.print("Average miles per gallon: ");
        this.average = sc.nextDouble();
        System.out.print("Parking fees per day: ");
        this.parkFees = sc.nextDouble();
        System.out.print("Tolls per day: ");
        this.tolls = sc.nextInt();
    }

    public double calculateCost(){
        double fuelcost = (this.miles / this.average ) * this.gallonCost;
        return fuelcost + parkFees + tolls;
    }

    public  void displayDetails(){
        System.out.println("Total Cost Per Day: "+calculateCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        que3 dailyAverage = new que3();
        System.out.println("Enter The Following Details To Calculate Your Per Day Cost !!");
        dailyAverage.acceptDetails(sc);
        dailyAverage.displayDetails();
    }
}
