package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.models.person.Customer;
import case_study.task1.FuramaResort.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (int i = 0 ; i < customerList.size();i++){
            System.out.println(customerList.get(i).toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Input date of birth");
        String date = sc.nextLine();
        System.out.println("Input gender");
        String gender = sc.nextLine();
        System.out.println("Input id of customer");
        int iD = Integer.parseInt(sc.nextLine());
        System.out.println("Input phone number");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Input email");
        String email =  sc.nextLine();
        System.out.println("Input customer code");
        String codeCustomer = sc.nextLine();
        System.out.println("Input type of customer");
        String typeCustomer = sc.nextLine();
        System.out.println("Input address of customer");
        String address = sc.nextLine();
        Customer customer = new Customer(name,date,gender,iD, phoneNumber, email, codeCustomer,typeCustomer,address);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Input name of customer you want to edit");
        String nameToEdit = sc.nextLine();
        for(int i = 0 ; i < customerList.size();i++){
            if(customerList.get(i).getName().equals(nameToEdit)){
                System.out.println("Input name");
                customerList.get(i).setName(sc.nextLine());
                System.out.println("Input date of birth");
                customerList.get(i).setDateOfBirth(sc.nextLine());
                System.out.println("Input gender");
                customerList.get(i).setGender(sc.nextLine());
                System.out.println("Input id of customer");
                customerList.get(i).setID(Integer.parseInt(sc.nextLine()));
                System.out.println("Input phone number");
                customerList.get(i).setPhoneNumber(Integer.parseInt(sc.nextLine()));
                System.out.println("Input email");
                customerList.get(i).setEmail(sc.nextLine());
                System.out.println("Input customer code");
                customerList.get(i).setCustomerCode(sc.nextLine());
                System.out.println("Input type of customer");
                customerList.get(i).setTypeOfCustomer(sc.nextLine());
                System.out.println("Input address of customer");
                customerList.get(i).setAddress(sc.nextLine());
            }else{
                System.out.println("Customer does not exits");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Input name of customer you want to delete");
        String nameToDelete = sc.nextLine();
        for(int i = 0 ; i < customerList.size();i++){
            if(customerList.get(i).getName().equals(nameToDelete)){
               customerList.remove(i);
            }
    }
}
}
