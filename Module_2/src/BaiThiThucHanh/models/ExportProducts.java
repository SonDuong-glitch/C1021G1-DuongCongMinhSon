package BaiThiThucHanh.models;

public class ExportProducts extends Product {
    private double exportProduct;
    private String exportingCountry;

    public ExportProducts() {
    }

    public ExportProducts(String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer) {
        super(iDProduct, productCode, nameProduct, priceForSale, quanlily, producer);
    }

    public ExportProducts(double exportProduct, String exportingCountry) {
        this.exportProduct = exportProduct;
        this.exportingCountry = exportingCountry;
    }

    public ExportProducts(String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer, double exportProduct, String exportingCountry) {
        super(iDProduct, productCode, nameProduct, priceForSale, quanlily, producer);
        this.exportProduct = exportProduct;
        this.exportingCountry = exportingCountry;
    }

    public double getExportProduct() {
        return exportProduct;
    }

    public void setExportProduct(double exportProduct) {
        this.exportProduct = exportProduct;
    }

    public String getExportingCountry() {
        return exportingCountry;
    }

    public void setExportingCountry(String exportingCountry) {
        this.exportingCountry = exportingCountry;
    }

    @Override
    public String toString() {
        return "ExportProducts{" +
                "exportProduct=" + exportProduct +
                ", exportingCountry='" + exportingCountry + '\'' +
                '}';
    }
}
