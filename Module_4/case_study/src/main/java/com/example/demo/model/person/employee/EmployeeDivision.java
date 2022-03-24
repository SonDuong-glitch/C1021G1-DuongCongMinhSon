package com.example.demo.model.person.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeeDivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_division")
    private Long idDivision;
    private String divisionType;
    @OneToMany(mappedBy = "employeeDivision")
    private List<Employee> employees;

    public EmployeeDivision() {
    }

    public EmployeeDivision(Long idDivision, String divisionType, List<Employee> employees) {
        this.idDivision = idDivision;
        this.divisionType = divisionType;
        this.employees = employees;
    }

    public Long getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Long idDivision) {
        this.idDivision = idDivision;
    }

    public String getDivisionType() {
        return divisionType;
    }

    public void setDivisionType(String divisionType) {
        this.divisionType = divisionType;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
