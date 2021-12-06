package week1.week1_java_array_method.week1_java_array_baitap;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        String str = "Minh Minh Minh Sin";
        int count = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kí tự: ");
        char ch=scanner.next().charAt(0);
        for (int i = 0 ; i < str.length() ; i++){
         if(ch == str.charAt(i)){
            count++;
         }
        }
        System.out.println(count);
    }
}
