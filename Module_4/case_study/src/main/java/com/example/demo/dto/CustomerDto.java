package com.example.demo.dto;

import com.example.demo.model.person.customer.CustomerType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Component
public class CustomerDto implements Validator {
    private Long id;
    @Size(min = 4,max = 45)
    private String customerName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    private LocalDate customerBirthday;
    private boolean customerGender;
    private Long customerIdCard;
    @Pattern(regexp = "(84|0[3|5|7|8|9])+([0-9]{8})\\b", message = "Format Number is not true")
    private String customerPhone;
    @Email
    @NotBlank
    private String customerEmail;
    @Size(min = 4,max = 45)
    private String customerAddress;
    private CustomerType customerType;
    public CustomerDto(Long id, String customerName, LocalDate customerBirthday, boolean customerGender, Long customerIdCard,
                       String customerPhone, String customerEmail, String customerAddress, CustomerType customerType) {
        this.id = id;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }


    public CustomerDto() {
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(LocalDate customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public Long getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(Long customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
        if("".equals(customerDto.getCustomerName())){
            errors.rejectValue("customerName","","Nhập đúng dữ liệu");
        }
        if("".equals(customerDto.getCustomerBirthday())){
            errors.rejectValue("customerBirthday","","Ngày sinh không được để trống");
        }
        if("".equals(customerDto.isCustomerGender())){
            errors.rejectValue("customerGender","","Nhập đúng dữ liệu");
        }
        if("".equals(customerDto.getCustomerIdCard())){
            errors.rejectValue("customerIdCard","","Nhập đúng dữ liệu");
        }
        if("".equals(customerDto.getCustomerPhone())){
            errors.rejectValue("customerPhone","","Nhập đúng dữ liệu");
        }
        if("".equals(customerDto.getCustomerEmail())){
            errors.rejectValue("customerEmail","","Nhập đúng dữ liệu");
        }
        if("".equals(customerDto.getCustomerAddress())){
            errors.rejectValue("customerAddress","","Nhập đúng dữ liệu");
        }
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerBirthday=" + customerBirthday +
                ", customerGender=" + customerGender +
                ", customerIdCard=" + customerIdCard +
                ", customerPhone=" + customerPhone +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerType=" + customerType +
                '}';
    }
}
