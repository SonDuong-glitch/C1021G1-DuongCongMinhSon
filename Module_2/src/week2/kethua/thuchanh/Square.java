package week2.kethua.thuchanh;

class Square extends Retangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filler) {
        super(side, side, color, filler);
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
                + super.toString();
    }
}
