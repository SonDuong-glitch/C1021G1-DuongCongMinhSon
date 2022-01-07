package thithu.phan2.models;

public class HandGoodsPhone extends Phone{
    private String portableCountry;
    private String status;

    public HandGoodsPhone() {
    }

    public HandGoodsPhone(String portableCountry, String status) {
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public HandGoodsPhone(int id, String nameOfPhone, double priceForSale, double quantily, String producer, String portableCountry, String status) {
        super(id, nameOfPhone, priceForSale, quantily, producer);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandGoodsPhone{" +
                "portableCountry='" + portableCountry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
