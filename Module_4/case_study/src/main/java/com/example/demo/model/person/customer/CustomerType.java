package com.example.demo.model.person.customer;

import javax.persistence.*;
import java.util.List;
@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private Long idType;
    private String customerType;
    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public CustomerType() {
    }

    public CustomerType(Long idType, String customerType) {
        this.idType = idType;
        this.customerType = customerType;
    }

    public Long getIdType() {
        return idType;
    }

    public void setId_type(Long idType) {
        this.idType = idType;
    }

    public String getCustomer_type() {
        return customerType;
    }

    public void setCustomer_type(String customerType) {
        this.customerType = customerType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
