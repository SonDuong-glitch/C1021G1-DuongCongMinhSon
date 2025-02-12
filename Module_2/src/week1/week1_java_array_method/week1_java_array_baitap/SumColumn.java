package week1.week1_java_array_method.week1_java_array_baitap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int tong = 0 ;
        System.out.println("Nhập cột mà bạn muốn tính tổng: ");
        int k = scanner.nextInt();
        for(int i = 0 ; i <m ; i++){
            tong += A[i][k];
        }
        System.out.println("tổng  " + tong);
    }
}
