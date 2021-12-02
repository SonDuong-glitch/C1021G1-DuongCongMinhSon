package week1.week1_loop_in_java.week1_loop_in_java_baitap;

import java.util.Scanner;

public class HienThiHinhChuNhat {
    public static void main(String[] args){
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        n = scanner.nextInt();
        System.out.println("Input M");
        m = scanner.nextInt();
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < m; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
