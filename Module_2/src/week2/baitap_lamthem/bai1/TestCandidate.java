package week2.baitap_lamthem.bai1;


import java.util.Scanner;

public class TestCandidate {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongtin(Candidate sinhVien){
        System.out.println("Nhập mã sinh viên");
        sinhVien.setMsv(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên");
        sinhVien.setName(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        sinhVien.setdOB(sc.nextLine());
        System.out.println("Nhập điểm Toán");
        sinhVien.setDiemToan(sc.nextInt());
        System.out.println("Nhập điểm Anh");
        sinhVien.setDiemAnh(sc.nextInt());
        System.out.println("Nhập điểm Văn");
        sinhVien.setDiemVan(sc.nextInt());
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập số lương sinh viên cần khai báo: ");
        n = sc.nextInt();
        Candidate[] sv = new Candidate[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1)+": ");
            sv[i] = new Candidate();
            nhapThongtin(sv[i]);
    }
        for(int i = 0 ; i < sv.length ; i++){
            if(sv[i].tongDiem() > 15)
            System.out.println(sv[i].toString());
        }


}
}
