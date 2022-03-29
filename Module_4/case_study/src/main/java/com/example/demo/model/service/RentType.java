package com.example.demo.model.service;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_type_id")
    private Long rentId;
    private String nameRent;
    private double rentCost;

    public RentType() {
    }

    public RentType(Long rentId, String nameRent, double rentCost, List<Service> serviceList) {
        this.rentId = rentId;
        this.nameRent = nameRent;
        this.rentCost = rentCost;
        this.serviceList = serviceList;
    }

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    public String getNameRent() {
        return nameRent;
    }

    public void setNameRent(String nameRent) {
        this.nameRent = nameRent;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    @OneToMany(mappedBy = "rentType")
    private List<Service> serviceList;
}
