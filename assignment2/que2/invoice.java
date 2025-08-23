package com.sunbeam.Assignments.assignment2.que2;

public class invoice {
    private String partnum;
    private String partDescription;
    private int quantity;
    private double price;

    public invoice(String partnum, String partDescription, int quantity, double price) {
        this.partnum = partnum;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getPartnum() {
        return partnum;
    }

    public void setPartnum(String partnum) {
        this.partnum = partnum;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price > 0) ? price : 0.0;
    }

    public double getInvoice(){
        return price * quantity;
    }
}
