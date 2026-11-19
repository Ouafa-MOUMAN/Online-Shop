package com.example.onlineshop;

public class Product {
    private int imageResource;
    private String name;
    private double price;
    private int rating;
    private boolean isMostPopular;
    private boolean hasYearEndDeal;
    private String discount;
    private String soldCount;

    public Product(int imageResource, String name, double price, int rating) {
        this.imageResource = imageResource;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.isMostPopular = false;
        this.hasYearEndDeal = false;
        this.discount = null;
        this.soldCount = null;
    }

    // Getters
    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public boolean isMostPopular() {
        return isMostPopular;
    }

    public boolean hasYearEndDeal() {
        return hasYearEndDeal;
    }

    public String getDiscount() {
        return discount;
    }

    public String getSoldCount() {
        return soldCount;
    }

    // Setters
    public void setMostPopular(boolean mostPopular) {
        isMostPopular = mostPopular;
    }

    public void setYearEndDeal(boolean yearEndDeal) {
        hasYearEndDeal = yearEndDeal;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setSoldCount(String soldCount) {
        this.soldCount = soldCount;
    }
}