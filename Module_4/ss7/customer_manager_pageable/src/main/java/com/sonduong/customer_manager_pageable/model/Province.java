package com.sonduong.customer_manager_pageable.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameProvince;
    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customerList ;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public Province() {
    }

    public Province(int id, String nameProvince) {
        this.id = id;
        this.nameProvince = nameProvince;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
