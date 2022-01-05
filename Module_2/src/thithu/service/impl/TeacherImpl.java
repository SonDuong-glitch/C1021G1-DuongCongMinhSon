package thithu.service.impl;


import thithu.models.Student;
import thithu.models.Teacher;
import thithu.service.ITeacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherImpl implements ITeacher {
    public static final String File_Teacher = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\thithu\\data\\teacher.csv";
    List<Teacher> teacherList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addTeacher() {
//        String name, String dateOfBirth, String gender, String teacherId, String specialize
        System.out.println("Input Name of teacher");
        String nameTeacher = sc.nextLine();
        System.out.println("Input Date of birth");
        String dateOfBirth = sc.nextLine();
        while (dateOfBirth == null || !dateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})$")){
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
        System.out.println("Input teacher Id");
        String teacherId = sc.nextLine();
        while (teacherId == null || !teacherId.matches("(GV)[0-9]{4}")){
            System.out.println("The format is SV-XXXX(4 number)");
            System.out.println("Pls input again");
            teacherId = sc.nextLine();
        }
        System.out.println("Input specialize");
        String specialize= sc.nextLine();
        Teacher teacher = new Teacher(nameTeacher,dateOfBirth,gender,teacherId,specialize);
        teacherList.add(teacher);
    }

    @Override
    public void delete() {
        System.out.println("Input id of teacher you want to delete");
        String idToDelete = sc.nextLine();
        for(int i = 0 ; i < teacherList.size();i++){
            if(teacherList.get(i).getTeacherId().equals(idToDelete)){
                teacherList.remove(i);
            }
        }
    }

    @Override
    public void displayList() {
        List<Teacher> teacherList = null;
        teacherList = readFileTeacher(File_Teacher);
        for(int i = 0 ; i < teacherList.size();i++){
            System.out.println(teacherList.get(i).toString());
        }
    }

    @Override
    public void searchTeacher() {
        System.out.println("Input name of teacher you want to search");
        String nameToSearch = sc.nextLine();
        for(int i = 0 ; i < teacherList.size();i++){
            if(teacherList.get(i).getName().equals(nameToSearch)){
                System.out.println(teacherList.get(i).toString());
            }
        }
    }
    public  static void writeFileTeacher(String patch , List<Teacher> teacherList){
        try {
            FileWriter fileWriter = new FileWriter(patch);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Teacher teacher : teacherList){
                  bufferedWriter.write(teacher.getTeacherId()+","
                  +teacher.getName()+","
                  +teacher.getGender()+","
                  +teacher.getDateOfBirth()+","
                  +teacher.getSpecialize()+"\n");

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Teacher> readFileTeacher(String patch){
        List<Teacher> listTeacher = new ArrayList<Teacher>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(patch));
            String line;
            String temp[];
            Teacher teacher;
            while ((line = bufferedReader.readLine()) !=null){
                temp = line.split(",");
                teacher = new Teacher(temp[0],temp[1],temp[2],temp[3],temp[4]);
                listTeacher.add(teacher);
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
        return listTeacher;
    }
}
