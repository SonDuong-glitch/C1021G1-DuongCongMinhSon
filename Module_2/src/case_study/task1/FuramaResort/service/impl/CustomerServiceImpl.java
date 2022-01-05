package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.controller.MyException;
import case_study.task1.FuramaResort.models.person.Customer;
import case_study.task1.FuramaResort.service.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static final String File_Customer = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\case_study\\task1\\FuramaResort\\data\\Customer.csv";
    List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        List<Customer> customerList = null;
        customerList = readFile(File_Customer);
        for (int i = 0 ; i < customerList.size();i++){
            System.out.println(customerList.get(i).toString());
        }
    }
    public static void writeFile(String filepath,List<Customer>customers)
    {
        try {
            FileWriter fw=new FileWriter(filepath);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Customer customer:customers)
            {
                bw.write(customer.getCustomerCode()+","+
                        customer.getName()+","+
                        customer.getDateOfBirth()+","+
                        customer.getGender()+","+
                        customer.getID()+","+
                        customer.getPhoneNumber()+","+
                        customer.getEmail()+","+
                        customer.getTypeOfCustomer()+","+
                        customer.getAddress()+"\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Customer>  readFile( String filepatch){
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader(filepatch));
             String line;
             String temp[];
             Customer customer;
             while ((line = bufferedReader.readLine()) == null){
                 temp = line.split(",");
                 customer = new Customer(temp[0],temp[1],temp[2],temp[3],temp[4], temp[5],temp[6],temp[7],temp[8]);
                 customerList.add(customer);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }


    @Override
    public void addNew() {
        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Input date of birth");
        String date = sc.nextLine();
        while (date == null || !date.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$")){
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer date of birth");
            date=sc.nextLine();
        }
        System.out.println("Input gender");
        String gender = sc.nextLine();
        while(gender==null||!gender.matches("[Nn][Aa][Mm]|[Nn][Uu]"))
        {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer gender (Nam/Nu):");
            gender=sc.nextLine();
        }
        System.out.println("Input id of customer");
        String iD = sc.nextLine();
        System.out.println("Input phone number");
        String phoneNumber =  sc.nextLine();
        System.out.println("Input email");
        String email =  sc.nextLine();
        while (email == null || !email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")){
            System.out.println("Input again .Example : xxxx@gmail.com ");
            email = sc.nextLine();
        }
        System.out.println("Input customer code");
        String codeCustomer = sc.nextLine();
        System.out.println("Input type of customer");
        String typeCustomer = sc.nextLine();
        while (typeCustomer == null || !typeCustomer.matches("[Dd][i][a][m][o][n][d]|[Gg][o][l][d]|[Ss][i][l][v][e][r]|[Mm][e][m][b][e][r]")){
            System.out.println("Please input Diamond, Gold, Silver or Member");
            typeCustomer = sc.nextLine();
        }
        System.out.println("Input address of customer");
        String address = sc.nextLine();
        Customer customer = new Customer(name,date,gender,iD, phoneNumber, email, codeCustomer,typeCustomer,address);
        customerList.add(customer);
        writeFile(File_Customer,customerList);
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
                customerList.get(i).setID(sc.nextLine());
                System.out.println("Input phone number");
                customerList.get(i).setPhoneNumber(sc.nextLine());
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
                try {
                    throw new MyException();
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }

            }
    }
    }
}
