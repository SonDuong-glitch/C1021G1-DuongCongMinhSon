package week2.abstractClass_interface.baitap.resizeable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("green",true,9);
        circle.resize(0.2);
        System.out.println(circle);
    }
}
