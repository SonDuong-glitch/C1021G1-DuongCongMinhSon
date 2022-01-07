package thithu.phan1.controler;
import thithu.phan1.service.impl.StudentImpl;
import thithu.phan1.service.impl.TeacherImpl;

import java.util.Scanner;

public  class Main {
    public static void displayMainMenu(){
        do {
            System.out.println("1.Student");
            System.out.println("2.Teacher");
            System.out.println("3.Exit");
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    studentMenu();
                    break;
                case 2:
                    teacherMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void studentMenu(){
        StudentImpl student = new StudentImpl();
        do {
            System.out.println("1. Add new Student ");
            System.out.println("2. Delete Student");
            System.out.println("3. Display list student");
            System.out.println("4. Search Student");
            System.out.println("5: Exit to main menu");
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.delete();
                    break;
                case 3:
                    student.displayList();
                    break;
                case 4:
                    student.searchStudent();
                    break;
                case 5:
                    displayMainMenu();
                    break;

            }
        }while (true);

    }
    public static void teacherMenu(){
        TeacherImpl teacher = new TeacherImpl();
        do {
            System.out.println("1. Add new Teacher ");
            System.out.println("2. Delete Teacher");
            System.out.println("3. Display list Teacher");
            System.out.println("4. Search Teacher");
            System.out.println("5: Exit to main menu ");
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    teacher.addTeacher();
                    break;
                case 2:
                    teacher.delete();
                    break;
                case 3:
                    teacher.displayList();
                    break;
                case 4:
                    teacher.searchTeacher();
                    break;
                case 5:
                    displayMainMenu();
                    break;
            }
        }while (true);

    }
    public static void main(String[] args) {
            displayMainMenu();
        }
}
