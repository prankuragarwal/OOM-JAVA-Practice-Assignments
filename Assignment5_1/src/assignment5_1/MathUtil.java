package assignment5_1;

import java.util.*;

//prankuragarwal

public class MathUtil {
    int num;
    double radius;
    MathUtil(int num, double radius){
        this.num = num;
        this.radius = radius;
    }
    public double cubeRoot (int num) {
        double cr = (double) Math.cbrt(num);
        return cr;
    }
    public double circumference (double radius){
        double cir = 2 * radius;
        cir = cir * Math.PI;
        return cir;
    }
    public double area (double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
