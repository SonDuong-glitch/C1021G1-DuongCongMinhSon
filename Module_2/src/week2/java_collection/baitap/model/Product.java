package week2.java_collection.baitap.model;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product> {
    private String idProduct;
    private String nameProduct;
    private String dateOfManufacture;
    private String expiry;
    private int cost;

    public Product(String idProduct, String nameProduct, String dateOfManufacture, String expiry, int cost) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.cost = cost;
    }

    public Product() {
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiry='" + expiry + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return this.cost - o.getCost();
    }
}
