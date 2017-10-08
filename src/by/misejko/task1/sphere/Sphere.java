package by.misejko.task1.sphere;
import by.misejko.task1.point.Point;

public class Sphere {
    private double r;
    private Point c;

    public Sphere(){}
    public Sphere(Point d,double r){
         this.r=r;
        c=new Point(d.getX(),d.getY(),d.getZ());
    }
    public Sphere(double x,double y, double z,double r){
        c=new Point(x,y,z);
        this.r=r;

    }

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r=r;
    }

    @Override
    public String toString(){
        String str=new String(c.getX()+" "+c.getY()+" "+c.getZ()+" "+r);
        return str;
    }
}
