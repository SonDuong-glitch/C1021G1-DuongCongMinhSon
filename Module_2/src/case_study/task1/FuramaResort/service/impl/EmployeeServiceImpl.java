package case_study.task1.FuramaResort.service.impl;

import case_study.task1.FuramaResort.models.person.Employee;
import case_study.task1.FuramaResort.service.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static final String FIle_Employee  = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\case_study\\task1\\FuramaResort\\data\\EmployeeData.csv";
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
    }

    public static void writeFileEmployee(String patch, List<Employee> employeeList) {
        try {
            FileWriter fileWriter = new FileWriter(patch);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getName() + ","
                        + employee.getGender() + ","
                        + employee.getDateOfBirth() + ","
                        + employee.getID() + ","
                        + employee.getPhoneNumber() + ","
                        + employee.getEmail() + ","
                        + employee.getEmployeeCode() + ","
                        + employee.getLevel() + ","
                        + employee.getPosition() + ","
                        + employee.getSalary()+"\n");

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> readFileEmployee(String patch){
        List<Employee> employeeList = null;
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader(patch));
            String line;
            String temp[];
            Employee employee ;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                employee = new Employee(temp[0] , temp[1], temp[2], temp[3] ,temp[4] ,temp[5] ,temp[6] ,temp[7] ,temp[8] ,Double.parseDouble(temp[9]));
                employeeList.add(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    @Override
    public void addNew() {
        System.out.println("Input Name: ");
        String name = sc.nextLine();
        System.out.println("Input Date Of Birth");
        String date = sc.nextLine();
        while (date == null || !date.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$")) {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a employee date of birth");
            date = sc.nextLine();
        }
        System.out.println("Input gender");
        String gender = sc.nextLine();
        while (gender == null || !gender.matches("[Nn][Aa][Mm]|[Nn][Uu]")) {
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer gender (Nam/Nu):");
            gender = sc.nextLine();
        }
        System.out.println("Input ID");
        String id = sc.nextLine();
        System.out.println("Input phone number");
        String phoneNumber = sc.nextLine();
        System.out.println("Input Email");
        String email = sc.nextLine();
        while (email == null || !email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")){
            System.out.println("Input again .Example : xxxx@gmail.com ");
            email = sc.nextLine();
        }
        System.out.println("Input employee code");
        String codeEmployee = sc.nextLine();
        System.out.println("Input level");
        String level = sc.nextLine();
        System.out.println("Input position");
        String position = sc.nextLine();
        System.out.println("Input Salary");
        double salary = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(name, date, gender, id, phoneNumber, email, codeEmployee, level, position, salary);
        employeeList.add(employee);
        writeFileEmployee(FIle_Employee, employeeList);
    }

    @Override
    public void edit() {
        System.out.println("Input name of person you want to edit:");
        String nameOfPerson = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (nameOfPerson.equals(employeeList.get(i).getName())) {
                System.out.println("Input name");
                employeeList.get(i).setName(sc.nextLine());
                System.out.println("Input Date Of Birth");
                employeeList.get(i).setDateOfBirth(sc.nextLine());
                System.out.println("Input gender");
                employeeList.get(i).setGender(sc.nextLine());
                System.out.println("Input id");
                employeeList.get(i).setID(sc.nextLine());
                System.out.println("Input phoneNumber");
                employeeList.get(i).setPhoneNumber(sc.nextLine());
                System.out.println("Input Employee Code");
                employeeList.get(i).setEmployeeCode(sc.nextLine());
                System.out.println("Input level");
                employeeList.get(i).setLevel(sc.nextLine());
                System.out.println("Input position");
                employeeList.get(i).setPosition(sc.nextLine());
                System.out.println("Input salary");
                employeeList.get(i).setSalary(Double.parseDouble(sc.nextLine()));
            } else {
                System.out.println("this person does not exist");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("input name òf employee you want to delete");
        String nameTodelete = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (nameTodelete.equals(employeeList.get(i).getName())) {
                System.out.println("Nhap yes/no");
                String ip = sc.nextLine();
                if(ip.equals("Yes")){
                    employeeList.remove(i);
                }else{
                    continue;
                }
            }
        }
    }
}
