package com.example.demo.dto;

import com.example.demo.model.person.employee.EmployeeDivision;
import com.example.demo.model.person.employee.EmployeeEducationDegree;
import com.example.demo.model.person.employee.EmployeePosition;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

@Component
public class EmployeeDto implements Validator {
    private Long idEmployee;
    private String employeeName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate employeeBirthday;
    private String employeeIdCard;
    private String employeePhone;
    private String employeeEmail;
    private Long employeeSalary;
    private EmployeeEducationDegree employeeEducationDegree;
    private EmployeeDivision employeeDivision;
    private EmployeePosition employeePosition;

    public EmployeeDto() {
    }

    public EmployeeDto(Long idEmployee, String employeeName,LocalDate employeeBirthday, String employeeIdCard, String employeePhone,
                       String employeeEmail, Long employeeSalary, EmployeeEducationDegree employeeEducationDegree,
                       EmployeeDivision employeeDivision, EmployeePosition employeePosition) {
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

    public LocalDate getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(LocalDate employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        EmployeeDto EmployeeDto = (EmployeeDto) target;
        if("".equals(EmployeeDto.getEmployeeName())){
            errors.rejectValue("customerName","","Nhập đúng dữ liệu");
        }
        if("".equals(EmployeeDto.getEmployeeBirthday())){
            errors.rejectValue("customerEmail","","Nhập đúng dữ liệu");
        }
        if("".equals(EmployeeDto.getEmployeeIdCard())){
            errors.rejectValue("customerBirthday","","Ngày sinh không được để trống");
        }
        if("".equals(EmployeeDto.getEmployeePhone())){
            errors.rejectValue("customerGender","","Nhập đúng dữ liệu");
        }
        if("".equals(EmployeeDto.getEmployeeEmail())){
            errors.rejectValue("customerIdCard","","Nhập đúng dữ liệu");
        }
        if("".equals(EmployeeDto.getEmployeeSalary())){
            errors.rejectValue("customerPhone","","Nhập đúng dữ liệu");
        }

    }
}
