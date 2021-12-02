package week1.week1_java_introduction.week1_java_introduction_thuchanh;

import java.util.Scanner;

public class ThucHanhSuDungToanTu {
    public static void main(String[] args){
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        float area;
        area = width*height;
        System.out.println("Area is: "+area);
    }
}
