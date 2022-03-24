package com.example.demo.model.person.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_position")
    private Long idPosition;
    private String positionName;
    @OneToMany(mappedBy = "employeePosition")
    private List<Employee> employees;

    public EmployeePosition() {
    }

    public EmployeePosition(Long idPosition, String positionName, List<Employee> employees) {
        this.idPosition = idPosition;
        this.positionName = positionName;
        this.employees = employees;
    }

    public Long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
