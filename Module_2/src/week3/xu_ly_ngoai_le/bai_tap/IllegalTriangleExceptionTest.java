package week3.xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the first side of trianggle: ");
        double side1 = input.nextDouble();
        System.out.println("Input the second side of trianggle: ");
        double side2 = input.nextDouble();
        System.out.println("Input the third side of trianggle: ");
        double side3 = input.nextDouble();
        if (side1 + side2 < side3 || side1+side3<side2||side2+side3<side1) {
            throw new IllegalTriangleException("ERROR");
        }
        else if(side1<0||side2<0||side3<0)
        {
            throw new IllegalTriangleException("ERROR BElOW ZERO!");
        }
    }
}
