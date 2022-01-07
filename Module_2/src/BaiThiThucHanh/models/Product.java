package BaiThiThucHanh.models;

public abstract class Product {
    private String iDProduct;
    private String productCode;
    private String nameProduct;
    private double priceForSale;
    private double quanlily;
    private String producer;

    public Product() {
    }

    public Product(String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer) {
        this.iDProduct = iDProduct;
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.priceForSale = priceForSale;
        this.quanlily = quanlily;
        this.producer = producer;
    }

    public String getiDProduct() {
        return iDProduct;
    }

    public void setiDProduct(String iDProduct) {
        this.iDProduct = iDProduct;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceForSale() {
        return priceForSale;
    }

    public void setPriceForSale(double priceForSale) {
        this.priceForSale = priceForSale;
    }

    public double getQuanlily() {
        return quanlily;
    }

    public void setQuanlily(double quanlily) {
        this.quanlily = quanlily;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iDProduct='" + iDProduct + '\'' +
                ", productCode='" + productCode + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceForSale=" + priceForSale +
                ", quanlily=" + quanlily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
