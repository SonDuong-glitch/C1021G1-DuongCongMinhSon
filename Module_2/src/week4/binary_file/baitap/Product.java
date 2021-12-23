package week4.binary_file.baitap;

public class Product {
    private int id;
    private String name;
    private String productCompany;
    private double price;
    private String anyThing;

    public Product(int id, String name, String productCompany, double price, String anyThing) {
        this.id = id;
        this.name = name;
        this.productCompany = productCompany;
        this.price = price;
        this.anyThing = anyThing;
    }
    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAnyThing() {
        return anyThing;
    }

    public void setAnyThing(String anyThing) {
        this.anyThing = anyThing;
    }
}
