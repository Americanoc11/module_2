package ss6_inheritance.bai_tap.package_point2D_3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

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

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
    }

    @Override
    public String toString() {
        return
                super.toString() + "\n" + "Point3D{" +"x="+super.getX()+", y="+super.getY()+
                        ",z=" + z +", Array="+ Arrays.toString(getXYZ())+
                        '}';
    }
}
