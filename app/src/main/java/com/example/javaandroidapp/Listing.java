package com.example.javaandroidapp;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;

public class Listing {
    private String price;
    private String name;
    private String minOrder;
    private String currentOrder;
    private String image;
    private Date expiryDate;

    public Listing(String price, String name, String minOrder, String currentOrder, Date expiryDate, String image) {
        this.price = price;
        this.name = name;
        this.minOrder = minOrder;
        this.currentOrder = currentOrder;
        this.expiryDate = expiryDate;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinOrder() {
        return minOrder;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setMinOrder(String minOrder) {
        this.minOrder = minOrder;
    }

    public String getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(String currentOrder) {
        this.currentOrder = currentOrder;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getExpiryCountdown() {
        // Convert the Date object to LocalDate
        LocalDate localDate = expiryDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the period between the two dates
        Period period = Period.between(today, localDate);

        // Return the number of days in the period
        return period.getDays() + " Days Left";
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}