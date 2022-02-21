package model;

import java.sql.Date;

public class Employee {
    private int employeeID;
    private String employeeName;
    private Date employeeBirthday;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    private int positionId;
    private int educationDegreeId;
    private int divisionId;
    private String userName;

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public int getPositionId() {
        return positionId;
    }

    public int getEducationDegreeId() {
        return educationDegreeId;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public void setEducationDegreeId(int educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
