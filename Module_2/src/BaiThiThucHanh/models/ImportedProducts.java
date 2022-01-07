package BaiThiThucHanh.models;

public class ImportedProducts extends Product{
    private double importPrices;
    private String importProvince;
    private double importTax;

    public ImportedProducts() {
    }

    public ImportedProducts(String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer) {
        super(iDProduct, productCode, nameProduct, priceForSale, quanlily, producer);
    }

    public ImportedProducts(double importPrices, String importProvince, double importTax) {
        this.importPrices = importPrices;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public ImportedProducts(String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer, double importPrices, String importProvince, double importTax) {
        super(iDProduct, productCode, nameProduct, priceForSale, quanlily, producer);
        this.importPrices = importPrices;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public double getImportPrices() {
        return importPrices;
    }

    public void setImportPrices(double importPrices) {
        this.importPrices = importPrices;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportedProducts{" +
                "importPrices=" + importPrices +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }
}
