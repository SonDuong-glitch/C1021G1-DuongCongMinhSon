package week2.kethua.baitap.circle_cylinder;

public class Cylinder extends Circle{
    private double height = 2;
    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaOfCylinder(){
        return getHeight()*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                " height=" + height +
                ", Area Of Cylinder: "+getAreaOfCylinder()+
                '}';
    }
}
