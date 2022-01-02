package week5.behavioral_design_pattern.thuchanh.obsever;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
