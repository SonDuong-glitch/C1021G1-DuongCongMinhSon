package week5.behavioral_design_pattern.thuchanh.obsever;

public class OctObserver extends Observer{
    public OctObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
