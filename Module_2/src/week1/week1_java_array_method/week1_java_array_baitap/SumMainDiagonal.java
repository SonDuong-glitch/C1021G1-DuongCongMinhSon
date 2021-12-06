package week1.week1_java_array_method.week1_java_array_baitap;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột");
        int n = scanner.nextInt();
        int arr[][] = new int[m][n];
        if(m!=n){
            System.out.println("Không phải ma trận vuông");
        }else{
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    System.out.println("Nhập giá trị tại a["+i+"]"+"["+j+"]");
                    arr[i][j] = scanner.nextInt();
                }
            }
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    System.out.print(" "+arr[i][j]+" ");
                }
                System.out.println("\n");
            }
            int sum = 0 ;
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(i == j){
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("Tổng đường chéo chính là: "+sum);
        }
    }
}
