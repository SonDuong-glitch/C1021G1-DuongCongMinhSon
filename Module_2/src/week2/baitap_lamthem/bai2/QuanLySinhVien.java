package week2.baitap_lamthem.bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLySinhVien extends Student{
    private ArrayList danhSach;
    public QuanLySinhVien( ) {
        danhSach = new ArrayList(10);
    }
    public void add(Student sv) {
        danhSach.add(sv);
    }
    public void input(){
        int n;
        Scanner sc = new Scanner(System.in);
        Student sv = new Student();
        System.out.println("Nhập số lượng sinh viên: ");
        n=sc.nextInt();
        for(int i = 0 ; i < n;i++){
            System.out.println("Nhập thông tin sinh viên thứ"+(i+1));
            sv.inputStudent();
            add(sv);
        }
    }
    public void display(){
        int i = 1;
        for (Object sv: danhSach) {
            System.out.println(sv.toString());
        }
    }
}
