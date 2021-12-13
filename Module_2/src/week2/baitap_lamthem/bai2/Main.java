package week2.baitap_lamthem.bai2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList sinhVien = new ArrayList();
    QuanLySinhVien sinhVien1 = new QuanLySinhVien();
    sinhVien1.input();
    sinhVien1.display();
    sinhVien.add(sinhVien1);
        System.out.println(sinhVien);
}
}
