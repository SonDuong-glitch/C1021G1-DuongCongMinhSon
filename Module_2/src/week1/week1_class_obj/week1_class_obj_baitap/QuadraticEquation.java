package week1.week1_class_obj.week1_class_obj_baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double denta = b*b - 4*a*c;
        return denta;
    }
    public double getRoot1(){
        double root1 = (-b+Math.pow(getDiscriminant(),0.5))/2*a;
        return root1;
    }
    public double getRoot2(){
        double root2 = (-b-Math.pow(getDiscriminant(),0.5))/2*a;
        return root2;
    }
    public double getRoot(){
        double root = -b/2*a;
        return root;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A: ");
        double a = scanner.nextDouble();
        System.out.println("Input B: ");
        double b = scanner.nextDouble();
        System.out.println("Input C: ");
        double c = scanner.nextDouble();
        QuadraticEquation bai1 = new QuadraticEquation(a,b,c);
        if(bai1.getDiscriminant() > 0){
            System.out.println("Phương trình có hai nghiệm . Với x1 = "+bai1.getRoot1()+" và x2= "+bai1.getRoot2());
        }else if(bai1.getDiscriminant() == 0){
            System.out.println("Phương trình có một nghiệm duy nhất x=" +bai1.getRoot());
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
