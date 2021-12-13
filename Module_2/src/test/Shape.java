package test;

class Shape {
    private String color="red";

    public Shape()
    {

    }
    public Shape(String color)
    {
    this.color=color;
    }

    @Override
    public String toString() {
        return "Shape1{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
