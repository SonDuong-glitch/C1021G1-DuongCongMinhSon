package week1.week1_java_introduction.week1_java_introduction_baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
