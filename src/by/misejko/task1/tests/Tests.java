package by.misejko.task1.tests;


import by.misejko.task1.functional.Functional;
import by.misejko.task1.point.Point;
import by.misejko.task1.sphere.Sphere;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Tests {
    private static Sphere s;
    private static Functional f;

    @BeforeClass
    public static void initSphere(){
        s=new Sphere(new Point(2,2,2),2);
        f=new Functional();
        f.read();
    }

    @AfterClass
    public static void clearSphere(){
        s=null;
        f=null;
    }


    @Test
    public void isSphere(){
        Assert.assertTrue(s.getR()>0);
    }


}
