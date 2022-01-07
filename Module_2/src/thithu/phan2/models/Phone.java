package thithu.phan2.models;

public abstract class Phone {
    private int Id ;
    private String nameOfPhone;
    private double priceForSale;
    private double quantily;
    private String producer;

    public Phone() {
    }

    public Phone(int id, String nameOfPhone, double priceForSale, double quantily, String producer) {
        Id = id;
        this.nameOfPhone = nameOfPhone;
        this.priceForSale = priceForSale;
        this.quantily = quantily;
        this.producer = producer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameOfPhone() {
        return nameOfPhone;
    }

    public void setNameOfPhone(String nameOfPhone) {
        this.nameOfPhone = nameOfPhone;
    }

    public double getPriceForSale() {
        return priceForSale;
    }

    public void setPriceForSale(double priceForSale) {
        this.priceForSale = priceForSale;
    }

    public double getQuantily() {
        return quantily;
    }

    public void setQuantily(double quantily) {
        this.quantily = quantily;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Id=" + Id +
                ", nameOfPhone='" + nameOfPhone + '\'' +
                ", priceForSale=" + priceForSale +
                ", quantily=" + quantily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
