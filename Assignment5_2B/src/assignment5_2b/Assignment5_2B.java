package assignment5_2b;

import java.util.*;

public class Assignment5_2B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
	System.out.print("ENTER LENGTH OF RECTANGLE: ");
	double l = Double.parseDouble(sc.nextLine());
	System.out.print("ENTER BREADTH OF RECTANGLE: ");
	double b = Double.parseDouble(sc.nextLine());
	System.out.println("AREA = " + r.CalculateArea(l, b));
	Circle c = new Circle();
	System.out.print("ENTER RADIUS OF CIRCLE: ");
	double rd = Double.parseDouble(sc.nextLine());
	System.out.println("AREA = " + c.CalculateArea(rd));
	Triangle t = new Triangle();
	System.out.print("ENTER a : ");
	double al = Double.parseDouble(sc.nextLine());
	System.out.print("ENTER b : ");
	double bl = Double.parseDouble(sc.nextLine());
	System.out.print("ENTER c : ");
	double cl = Double.parseDouble(sc.nextLine());
	System.out.println("AREA = " + t.CalculateArea(al, bl, cl));
    }
    
}
