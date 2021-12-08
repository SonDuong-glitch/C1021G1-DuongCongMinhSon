package week2.kethua.baitap.class_point_moveablepoint;

public class MoveablePoint extends Point{
    float xSpped = 0.0f;
    float ySpeed = 0.0f;
    public MoveablePoint(){
    }
    public  MoveablePoint(float xSpped, float ySpeed){
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x,float y, float xSpped , float ySpeed){
        super(x,y);
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float getxSpped() {
        return xSpped;
    }

    public void setxSpped(float xSpped) {
        this.xSpped = xSpped;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpped , float ySpeed){
        setxSpped(xSpped);
        setxSpped(ySpeed);
    }
    public float[] getSpeed(){
        float arr[] = {xSpped,ySpeed};
        return  arr;
    }
    public MoveablePoint move(){
        float newX = getX() + xSpped;
        setX(newX);
        float newY = getY() + ySpeed;
        setY(newY);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpped=" + xSpped +
                ", ySpeed=" + ySpeed +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
