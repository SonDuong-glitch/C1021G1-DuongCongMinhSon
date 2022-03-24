package com.example.demo.model.person.employee;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    private String employeeName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate employeeBirthday;
    private String employeeIdCard;
    private String employeePhone;
    private String employeeEmail;
    private Long employeeSalary;
    public Employee() {
    }

    public Employee(Long idEmployee, String employeeName,LocalDate employeeBirthday, String employeeIdCard, String employeePhone,
                    String employeeEmail, Long employeeSalary, EmployeeEducationDegree employeeEducationDegree, EmployeeDivision employeeDivision, EmployeePosition employeePosition) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
        this.employeeEducationDegree = employeeEducationDegree;
        this.employeeDivision = employeeDivision;
        this.employeePosition = employeePosition;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public LocalDate getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(LocalDate employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public EmployeeEducationDegree getEmployeeEducationDegree() {
        return employeeEducationDegree;
    }

    public void setEmployeeEducationDegree(EmployeeEducationDegree employeeEducationDegree) {
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public EmployeeDivision getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(EmployeeDivision employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    @ManyToOne
    @JoinColumn(name = "id_degree_education" , referencedColumnName = "id_degree" )
    private EmployeeEducationDegree employeeEducationDegree;
    @ManyToOne
    @JoinColumn(name ="id_divison",referencedColumnName = "id_division")
    private EmployeeDivision employeeDivision;
    @ManyToOne
    @JoinColumn(name ="id_position",referencedColumnName = "id_position")
    private EmployeePosition employeePosition;
}
