package com.sonduong.model;

public class Product {
    private int id;
    private String nameProduct;
    private int price;
    private String inforProduct;
    private String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, int price, String inforProduct, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.inforProduct = inforProduct;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInforProduct() {
        return inforProduct;
    }

    public void setInforProduct(String inforProduct) {
        this.inforProduct = inforProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
