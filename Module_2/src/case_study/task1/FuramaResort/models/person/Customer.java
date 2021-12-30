package case_study.task1.FuramaResort.models.person;

public class Customer extends Person{
    private String customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer(String customerCode, String typeOfCustomer, String address) {
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String gender, int ID, int phoneNumber, String email, String customerCode, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, ID, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "customerCode='" + customerCode + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
