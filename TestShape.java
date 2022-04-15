package Abtract;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

import java.awt.*;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Rectangle(1,2);
        System.out.println(s1);
        System.out.println("Area is" + s1.getArea());
        Shape s2 = new Triangle(3,4);
        System.out.println(s2);
        System.out.println("Are is " + s2.getArea());
    }
}
