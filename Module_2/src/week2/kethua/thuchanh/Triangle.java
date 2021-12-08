package week2.kethua.thuchanh;

public class Triangle extends Shape{
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    public Triangle(){
    }
    public Triangle(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(double a, double b , double c, String color, boolean filled){
        super(color, filled);
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
    public double getArea(){
        double h;
        h = (getA() + getB())/2;
        double area;
        area = (h*getC())/2;
        return area;
    }
    public double getPerimeter(){
        double p ;
        p = getA()+getB()+getC();
        return p;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area= "+getArea()+
                ", Perimeter= "+getPerimeter()+" "+
                super.toString()+
                '}';
    }
}
