package com.example.demo.model.service;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_type_id")
    private Long serviceId;
    private String serviceTypeName;
    @OneToMany(mappedBy = "serviceType")
    List<Service> serviceList;

    public ServiceType() {
    }

    public ServiceType(Long serviceId, String serviceTypeName, List<Service> serviceList) {
        this.serviceId = serviceId;
        this.serviceTypeName = serviceTypeName;
        this.serviceList = serviceList;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
