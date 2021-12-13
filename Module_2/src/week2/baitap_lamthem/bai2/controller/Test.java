package week2.baitap_lamthem.bai2.controller;

import week2.baitap_lamthem.bai2.model.Student;
import week2.baitap_lamthem.bai2.service.IStudentService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IStudentService test = new IStudentService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student by ID");
            System.out.println("3.Remove student by index");
            System.out.println("4.Search by character or name");
            System.out.println("5.List all Student");
            System.out.println("6.Sort student");
            System.out.println("7.Exit");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    test.addStudent();
                    break;
                case 2:
                    test.removeStudentById();
                    break;
                case 3:
                    test.removeStudentByIndex();
                    break;
                case 4:
                    test.searchByNameOrChar();
                    break;
                case 5:
                    test.listAll();
                    break;
                case 6:
                    test.sortStudentByID();
                    break;
                case  7:
                    System.out.println("GoodBye");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
