package com.questions.ques1;

/*
Create a class called invoice that a hardware store might use to represent an invoice
for an item sold at the store. An invoice should include four pieces of information as
instance variables, a part number(type string), a part description (type string), a quantity
of the item being purchased (type int) and a price per item(double).Your class should have a
constructor that initializes the four instance variables. Provide a set and a get method for each
instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice
amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value .
If the quantity is not positive, it should be set to 0.If the price per item is not positive ,it should be set to 0.0.

Write a test app named InvoiceTest that demonstrate class Invoice’s capabilities.
 */

public class InvoiceTest {
    public static void main(String[] args) {


        Invoice invoice = new Invoice("Xr334", "Bolts", 23, 10.00);

        double invoiceAmount = invoice.getInvoiceAmount();
        System.out.println("The invoice amount: "+invoiceAmount);


        System.out.println("Before updated description: "+invoice.getPartDescription());
        invoice.setPartDescription("Wheels");
        System.out.println("Updated description: "+invoice.getPartDescription());

    }
}


