package week1.week1_loop_in_java.week1_loop_in_java_baitap;

import java.util.Scanner;

public class TriangleTopLeft {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N: ");
        n = scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
