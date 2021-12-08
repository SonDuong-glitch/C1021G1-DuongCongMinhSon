package week2.kethua.baitap.circle_cylinder;

public class Circle {
    private double radius = 2;
    private String color = "red";
    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color  = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2*getRadius()*Math.PI;
    }

    @Override
    public String toString() {
        return " Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area of Circle: "+getArea()+
                '}';
    }
}
