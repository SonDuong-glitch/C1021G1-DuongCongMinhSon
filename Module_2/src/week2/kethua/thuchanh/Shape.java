package week2.kethua.thuchanh;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius , String color , boolean filler){
        super(color,filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " which is subclass of "+super.toString()+
                '}';
    }
}
class Retangle extends Shape{
    private double width;
    private double length;
    public Retangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Retangle(double width , double length){
        this.width = width;
        this.length = length;
    }
    public Retangle(double width ,double length,String color, boolean filler){
        super(color,filler);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", length=" + length +
                " which is subclass of "+super.toString()+
                '}';
    }

    public double getArea(){
        return width*length;
    }
    public double getPermiter(){
        return (width+length)*2;
    }
}
class Square extends Retangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filler ){
        super(side,side,color,filler);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                +super.toString();
    }
}
class Test{
    public static void main(String[] args) {
        Retangle test1 = new Retangle();
        test1.setLength(4);
        test1.setWidth(6);
        test1.getArea();
        System.out.println(test1.getArea());
    }
}
