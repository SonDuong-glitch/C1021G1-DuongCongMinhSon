package case_study.task1.FuramaResort.controller;
import case_study.task1.FuramaResort.service.impl.CustomerServiceImpl;
import case_study.task1.FuramaResort.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3,Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                     break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        do {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Return main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        }while (true);
    }

    static void displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        do {
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Delete customer");
            System.out.println("5.Return main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        }while (true);
    }
    static void displayFacilityMenu(){
        do {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
        }while (true);
    }
    static void displayBookingMenu(){
        do {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
        }while (true);
    }
    static void displayPromotionMenu(){
        do {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your options");
            int choose = sc.nextInt();
        }while (true);
    }
}
