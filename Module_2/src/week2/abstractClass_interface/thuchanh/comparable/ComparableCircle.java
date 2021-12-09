package week2.abstractClass_interface.thuchanh.comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius , String color, boolean filler){
        super(color, filler, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() >  o.getRadius()){
            return 1;
        }else if(getRadius() < o.getRadius()){
            return -1;
        }else
        return 1;
    }
}
