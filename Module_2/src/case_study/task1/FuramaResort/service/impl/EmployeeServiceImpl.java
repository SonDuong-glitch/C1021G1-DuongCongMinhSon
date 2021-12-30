package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.models.person.Employee;
import case_study.task1.FuramaResort.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (int i = 0 ; i < employeeList.size();i++){
            System.out.println(employeeList.get(i).toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input Name: ");
        String name = sc.nextLine();
        System.out.println("Input Date Of Birth");
        String date = sc.nextLine();
        System.out.println("Input gender");
        String gender = sc.nextLine();
        System.out.println("Input ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input phone number");
        int phoneNumber =  Integer.parseInt(sc.nextLine());
        System.out.println("Input Email");
        String email = sc.nextLine();
        System.out.println("Input employee code");
        String codeEmployee = sc.nextLine();
        System.out.println("Input level");
        String level = sc.nextLine();
        System.out.println("Input position");
        String position = sc.nextLine();
        System.out.println("Input Salary");
        double salary = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(name,date,gender,id,phoneNumber,email,codeEmployee,level,position,salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Input name of person you want to edit:");
        String nameOfPerson = sc.nextLine();
        for(int i = 0 ; i < employeeList.size();i++){
            if(nameOfPerson.equals(employeeList.get(i).getName())){
                System.out.println("Input name");
                employeeList.get(i).setName(sc.nextLine());
                System.out.println("Input Date Of Birth");
                employeeList.get(i).setDateOfBirth(sc.nextLine());
                System.out.println("Input gender");
                employeeList.get(i).setGender(sc.nextLine());
                System.out.println("Input id");
                employeeList.get(i).setID(Integer.parseInt(sc.nextLine()));
                System.out.println("Input phoneNumber");
                employeeList.get(i).setPhoneNumber(Integer.parseInt(sc.nextLine()));
                System.out.println("Input Employee Code");
                employeeList.get(i).setEmployeeCode(sc.nextLine());
                System.out.println("Input level");
                employeeList.get(i).setLevel(sc.nextLine());
                System.out.println("Input position");
                employeeList.get(i).setPosition(sc.nextLine());
                System.out.println("Input salary");
                employeeList.get(i).setSalary(Double.parseDouble(sc.nextLine()));
            }else{
                System.out.println("this person does not exist");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("input name òf employee you want to delete");
        String nameTodelete = sc.nextLine();
        for(int i = 0 ; i < employeeList.size();i++){
            if(nameTodelete.equals(employeeList.get(i).getName())){
                employeeList.remove(i);
            }
        }

    }
}
