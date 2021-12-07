package week1.week1_class_obj.week1_class_obj_thuchanh;

public class Rectangle {

    private double height, width;

    public Rectangle(){

    }
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }
    public String display(){
        return "Retangle {"+" width: "+width+" height: "+height+" } ";
    }
}
