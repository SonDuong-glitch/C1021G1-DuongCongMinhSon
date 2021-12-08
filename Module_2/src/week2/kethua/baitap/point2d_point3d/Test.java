package week2.kethua.baitap.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,5,6);
        float arr[] = point3D.getXYZ();
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        point3D.setXYZ(8,9,10);
        float arr1[] = point3D.getXYZ();
        for (int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
