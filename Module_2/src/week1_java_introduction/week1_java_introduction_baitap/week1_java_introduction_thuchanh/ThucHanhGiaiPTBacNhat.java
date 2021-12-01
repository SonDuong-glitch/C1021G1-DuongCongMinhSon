package week1_java_introduction.week1_java_introduction_baitap.week1_java_introduction_thuchanh;

import java.util.Scanner;

public class ThucHanhGiaiPTBacNhat {
    public static void main (String[] args){
        double a;
        double b;
        double x;
        double c;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b' , please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        if(a!=0){
            x = (c-b)/a;
            System.out.println("Equation pass with x = %f!\n" +x);
        }else{
            if(b==c){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No solution");
            }
        }
    }
}
