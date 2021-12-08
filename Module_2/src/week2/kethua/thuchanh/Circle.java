package week2.kethua.thuchanh;

class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filler) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " which is subclass of " + super.toString() +
                '}';
    }

    static class Test{
        public static void main(String[] args) {
            Retangle test1 = new Retangle();
            test1.setLength(4);
            test1.setWidth(6);
            test1.getArea();
            System.out.println(test1.getArea());
        }
    }
}
