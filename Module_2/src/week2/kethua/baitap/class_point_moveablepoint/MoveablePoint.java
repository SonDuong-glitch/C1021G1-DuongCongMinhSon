package week2.kethua.baitap.class_point_moveablepoint;

public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    public MoveablePoint(){
    }
    public  MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x,float y, float xSpeed , float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpped() {
        return xSpeed;
    }

    public void setxSpped(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        setxSpped(xSpeed);
        setxSpped(ySpeed);
    }
    public float[] getSpeed(){
        float arr[] = {xSpeed,ySpeed};
        return  arr;
    }
    public MoveablePoint move(){
        float newX = getX() + xSpeed;
        setX(newX);
        float newY = getY() + ySpeed;
        setY(newY);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpped=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
