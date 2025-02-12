package test;

public class Triangle extends Shape {
    public double side1=1.0;
    public double side2=1.0;
    public double side3=1.0;

    public Triangle()
    {}

    public Triangle(double side1,double side2,double side3,String color)
    {
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getArea()
    {
    double periMTeter=this.side1+this.side2+this.side3;
    double p=periMTeter/2;
    double areaPow=p*(p-this.side1)*(p-this.side2)*(p-this.side3);
    double area=Math.pow(areaPow,0.5);
    return area;
    }
    public double getPerimeter()
    {
        return this.side1+this.side2+this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + this.getColor() +
                ", area="+this.getArea()+
                ", perimeter="+this.getPerimeter()+
                +'}';
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
