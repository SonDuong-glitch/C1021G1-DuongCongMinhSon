package model;

public class Product {
    private int idProduct;
   private String nameOfProduct;
   private double price;
   private double quantity;
   private String color;
   private String category;

    public Product() {
    }

    public Product(int idProduct, String nameOfPhone, double price, double quantity, String color, String category) {
        this.idProduct = idProduct;
        this.nameOfProduct = nameOfPhone;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.category = category;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameOfPhone='" + nameOfProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
