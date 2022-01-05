package thithu.service.impl;

import thithu.models.Student;
import thithu.service.IStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    public static final String FileStudent = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\thithu\\data\\student.csv";
    List <Student> studentList = new ArrayList<>();
    static {

    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void addStudent() {
        System.out.println("Input Name of Student");
        String name = sc.nextLine();
        System.out.println("Input Date of birth");
        String dateOfBirth = sc.nextLine();
        while (dateOfBirth == null || !dateOfBirth.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")){
            System.out.println("Please re-enter, input is wrong!");
            System.out.println("Enter a customer date of birth");
            dateOfBirth=sc.nextLine();
        }
        System.out.println("Input gender");
        String gender = sc.nextLine();
        while (gender == null || !gender.matches("[Nn][Aa][Mm]|[Nn][Uu]")){
            System.out.println("Pls Input again {Nam/Nu}");
            gender = sc.nextLine();
        }
        System.out.println("Input Student Id");
        String studentId = sc.nextLine();
        while (studentId == null || !studentId.matches("(SV)[0-9]{4}")){
            System.out.println("The format is SV-XXXX(4 number)");
            System.out.println("Pls input again");
            studentId = sc.nextLine();
        }
        System.out.println("Input class Name");
        String className = sc.nextLine();
        System.out.println("Input point");
        String point = sc.nextLine();
        Student student = new Student(name,dateOfBirth,gender,studentId,className,point);
        studentList.add(student);
        writeFileStudent(FileStudent , studentList);
    }

    @Override
    public void delete() {
        System.out.println("Input student ID you want to delete");
        String idToDel = sc.nextLine();
        for(int i = 0 ; i < studentList.size();i++){
            if(studentList.get(i).getStudentId().equals(idToDel)){
                studentList.remove(i);
            }
        }
    }

    @Override
    public  void displayList() {
        List<Student> studentList = null;
        studentList = readFile(FileStudent);
        for(int i = 0 ; i < studentList.size();i++){
            System.out.println(studentList.get(i).toString());
            }
    }

    @Override
    public void searchStudent() {
        System.out.println("Input student name you want to search");
        String nameToSearch = sc.nextLine();
        for(int i = 0 ; i < studentList.size();i++){
            if(studentList.get(i).getName().equals(nameToSearch)){
                System.out.println(studentList.get(i).toString());
            }
        }
    }
    public static void writeFileStudent(String patch, List<Student> studentList){
        try {
            FileWriter fileWriter = new FileWriter(patch);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: studentList) {
                bufferedWriter.write(student.getName()+","
                        +student.getStudentId()+","
                        +student.getGender()+","
                        +student.getClassName()+","
                        +student.getDateOfBirth()+","
                        +student.getPoint()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFile(String patch){
        List<Student> studentList1 = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(patch));
            String line;
            String[] temp;
            Student student;
            while ((line = br.readLine()) != null){
                temp = line.split(",");
                student = new Student(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
                studentList1.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList1;
    }
}
