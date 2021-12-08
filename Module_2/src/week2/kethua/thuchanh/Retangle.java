package week2.kethua.thuchanh;

class Retangle extends Shape {
    private double width;
    private double length;

    public Retangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(double width, double length, String color, boolean filler) {
        super(color, filler);
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
                " which is subclass of " + super.toString() +
                '}';
    }

    public double getArea() {
        return width * length;
    }

    public double getPermiter() {
        return (width + length) * 2;
    }
}
