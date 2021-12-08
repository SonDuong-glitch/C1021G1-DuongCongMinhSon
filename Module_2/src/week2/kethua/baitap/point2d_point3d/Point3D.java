package week2.kethua.baitap.point2d_point3d;

public class Point3D extends Point2D{
    private float z= 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y){
    super(x,y);
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        float arr1[] = {getX(),getY(),getZ()};
        return arr1;
    }
}
