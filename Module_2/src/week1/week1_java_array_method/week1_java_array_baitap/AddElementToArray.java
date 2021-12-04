package week1.week1_java_array_method.week1_java_array_baitap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n + 1];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhập vị trí muốn chèn");
        int x = scanner.nextInt();
        if (x > n) {
            System.out.println("Không tìm thấy vị trí bạn muốn chèn");
        } else {
            if (x < n && x > 0) {
                System.out.println("Nhập số bạn muốn chèn");
                int num = scanner.nextInt();
                for (i = n ; i > x ; i--){
                    A[i] = A[i-1];
                }
                A[x] = num;
            }
        }
        for (i = 0 ; i < n ; i++){
            System.out.println(A[i]);
        }
    }
}