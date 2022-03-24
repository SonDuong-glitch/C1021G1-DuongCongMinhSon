package com.example.demo.model.person.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeeEducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_degree")
    private Long idDegree;
    private String degreeEducation;
    @OneToMany(mappedBy = "employeeEducationDegree")
    private List<Employee> employees;

    public EmployeeEducationDegree() {
    }

    public EmployeeEducationDegree(Long idDegree, String degreeEducation, List<Employee> employees) {
        this.idDegree = idDegree;
        this.degreeEducation = degreeEducation;
        this.employees = employees;
    }

    public Long getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(Long idDegree) {
        this.idDegree = idDegree;
    }

    public String getDegreeEducation() {
        return degreeEducation;
    }

    public void setDegreeEducation(String degreeEducation) {
        this.degreeEducation = degreeEducation;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
