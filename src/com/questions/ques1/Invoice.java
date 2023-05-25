package com.questions.ques1;

import java.security.SecureRandom;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int itemPurchased;
    private double pricePerItem;


    Invoice(String partNumber, String partDescription, int itemPurchased, double pricePerItem) {
        this.setPartNumber(partNumber);
        this.setPartDescription(partDescription);
        this.setItemPurchased(itemPurchased);
        this.setPricePerItem(pricePerItem);

    }


    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getItemPurchased() {
        return itemPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        if (pricePerItem < 0) {
            pricePerItem = 0;
        }
        if (itemPurchased < 0) {
            itemPurchased = 0;
        }
        double invoiceAmount = itemPurchased * pricePerItem;
        return invoiceAmount;
    }


    // setters
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setItemPurchased(int itemPurchased) {
        this.itemPurchased = itemPurchased;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


}
