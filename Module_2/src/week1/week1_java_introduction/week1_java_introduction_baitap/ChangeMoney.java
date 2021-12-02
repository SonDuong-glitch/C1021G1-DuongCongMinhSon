package week1.week1_java_introduction.week1_java_introduction_baitap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args){
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many USD you want to change: ");
        usd = scanner.nextInt();
        System.out.println("Value: "+usd*vnd +" VND");
    }
}
