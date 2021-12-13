package week2.baitap_lamthem.bai2.service;

import org.jetbrains.annotations.NotNull;
import week2.baitap_lamthem.bai2.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IStudentService implements IStudent {
   private Student[] students = new Student[100];
   private static Scanner sc = new Scanner(System.in);
   private static int count = 0;

   @Override
   public void addStudent() {
      if (count < students.length) {
         System.out.println("Input ID");
         String id = sc.nextLine();
         System.out.println("Input Name");
         String name = sc.nextLine();
         System.out.println("Input Date of birth");
         String dOB = sc.nextLine();
         System.out.println("Input Gender");
         String gender = sc.nextLine();
         System.out.println("Input Class name");
         String className = sc.nextLine();
         System.out.println("Input course");
         String course = sc.nextLine();
         Student student = new Student(id, name, dOB, gender, className, course);
         students[count] = student;
         count++;
      } else {
         System.out.println("List Full");
      }
   }

   @Override
   public void listAll() {
      for (Student student : students
      ) {
         if (student == null) {
            break;
         }
         System.out.println(student);
      }
   }

   @Override
   public void removeStudentById() {
      String identify;
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập vào id của đôi tượng cần xóa ");
      identify = sc.nextLine();
      int index = 0;
      for (int i = 0; i < students.length; i++) {
         if (students[i].getId().equals(identify)) {
            index = i;
            break;
         }
      }
      if (index != students.length) {
         for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
         }
      } else {
         students[index] = null;
      }
      count--;
   }

   @Override
   public void removeStudentByIndex() {
      int index;
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập vao vị trí cần xóa:");
      index = sc.nextInt();
      for (int i = index; i < students.length - 1; i++) {
         students[i] = students[i + 1];
      }
      students[students.length - 1] = null;
      count--;
   }

   @Override
   public void searchByNameOrChar() {
      int choose;

      Scanner sc = new Scanner(System.in);
      do {
         System.out.println("1. Tìm kiếm theo tên");
         System.out.println("2. Tìm kiếm theo ký tự");
         System.out.println("3. Exit");
         choose = sc.nextInt();
         String keyword;
         sc.nextLine();
         switch (choose){
            case 1:
               System.out.println("Nhập vào tên bạn muốn tìm");
               keyword = sc.nextLine();
               for (int i = 0 ; i < students.length; i++) {
                  if(students[i] == null){
                     break;
                  }else if(students[i].getName().equals(keyword)){
                     System.out.println(students[i]);
                  }
               }
               break;
            case 2:
               System.out.println("Nhập vào ký tự bạn muốn tìm");
               keyword = sc.nextLine();
               for (int i = 0 ; i < students.length; i++) {
                  if(students[i] == null){
                     break;
                  } else if(students[i].getId().contains(keyword)){
                     System.out.println(students[i]);
                  }
               }
               break;
            case 3:
               System.exit(0);
         }
      }while(true);

   }

   @Override
   public void sortStudentByID() {
         Student newStudent [] = new Student[count];
         for(int i = 0 ; i < students.length ; i++){
            if(students[i] == null){
               break;
            }else{
             newStudent[i] = students[i];
            }
         }
         Arrays.sort(newStudent);
         for (int i = 0 ; i < newStudent.length ; i++){
            System.out.println(newStudent[i]);
         }
   }


}
