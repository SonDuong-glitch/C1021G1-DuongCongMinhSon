package week1.week1_java_array_method.week1_java_array_baitap;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        int n,i,m;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for ( i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        for (m = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[m] = A[i];
                m++;
            }
        }
        n = m;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }

}
