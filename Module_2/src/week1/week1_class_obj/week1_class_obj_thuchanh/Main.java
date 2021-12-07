package week1.week1_class_obj.week1_class_obj_thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height: ");
        double height = scanner.nextDouble();
        System.out.println("Input width : ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height,width);
        System.out.println("Your Area: "+rectangle.getArea());
        System.out.println("Your Perimeter: "+rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}
