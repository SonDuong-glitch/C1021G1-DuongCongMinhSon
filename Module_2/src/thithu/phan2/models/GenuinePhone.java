package thithu.phan2.models;

public class GenuinePhone extends Phone{
    private int warrantyPeriod;
    private String warrantyCoverage;

    public GenuinePhone() {
    }

    public GenuinePhone(int id, String nameOfPhone, double priceForSale, double quantily, String producer) {
        super(id, nameOfPhone, priceForSale, quantily, producer);
    }

    public GenuinePhone(int warrantyPeriod, String warrantyCoverage) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public GenuinePhone(int id, String nameOfPhone, double priceForSale, double quantily, String producer, int warrantyPeriod, String warrantyCoverage) {
        super(id, nameOfPhone, priceForSale, quantily, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "GenuinePhone.Exportproduct.csv{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
