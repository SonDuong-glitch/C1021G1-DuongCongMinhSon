package model;

public class Customer {
        private String name;
    private String dateOFBirth;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(String name, String dateOFBirth, String address, String img) {
        this.name = name;
        this.dateOFBirth = dateOFBirth;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
