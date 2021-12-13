package week2.baitap_lamthem.bai2;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String dateOFBirth;
    private String gender ;
    private String className;
    private String course;

    public Student(String id, String name, String dateOFBirth, String gender, String className, String course) {
        this.id = id;
        this.name = name;
        this.dateOFBirth = dateOFBirth;
        this.gender = gender;
        this.className = className;
        this.course = course;
    }

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void inputStudent (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên");
        setId(sc.nextLine());
        System.out.println("Nhập tên");
        setName(sc.nextLine());
        System.out.println("NHập ngày sinh");
        setDateOFBirth(sc.nextLine());
        System.out.println("Nhập giới tính");
        setGender(sc.nextLine());
        System.out.println("Nhập tên lớp");
        setClassName(sc.nextLine());
        System.out.println("Nhập khóa");
        setCourse(sc.nextLine());
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOFBirth='" + dateOFBirth + '\'' +
                ", gender=" + gender +
                ", className='" + className + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

}
