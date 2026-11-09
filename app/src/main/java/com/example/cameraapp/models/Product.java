package com.example.cameraapp.models;

public class Product {
    private int id;
    private String description;
    private String price;
    private int image;

    public Product(int id, String description, String price, int image) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.image = image;
    }
    
    public int getId(){return id;}
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public int getImage() { return image; }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }
}