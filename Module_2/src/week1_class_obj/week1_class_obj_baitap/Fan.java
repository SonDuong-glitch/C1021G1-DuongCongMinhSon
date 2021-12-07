package week1_class_obj.week1_class_obj_baitap;

public class Fan {
    private boolean on;
    private int speed = 1;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public void display(){
        if(on){
            switch (speed){
                case 1:
                    System.out.println("slow");
                    break;
                case 2:
                    System.out.println("medium");
                    break;
                case 3:
                    System.out.println("fast");
                    break;
                default:
                    System.out.println("Out of area");
                    break;
            }
            System.out.println(color);
            System.out.println(radius);
            System.out.println( "Fan is on");
        }else{
            switch (speed){
                case 1:
                    System.out.println("slow");
                    break;
                case 2:
                    System.out.println("medium");
                    break;
                case 3:
                    System.out.println("fast");
                    break;
                default:
                    System.out.println("Out of area");
                    break;
            }
            System.out.println(color);
            System.out.println(radius);
            System.out.println( "Fan is off");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        Fan fan = new Fan(3,10,"yellow",true);
        fan.display();
        Fan fan1 = new Fan(2,5,"blue",false);
        fan1.display();
    }
}
