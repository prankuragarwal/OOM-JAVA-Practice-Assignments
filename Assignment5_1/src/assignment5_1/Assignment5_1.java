package assignment5_1;

import java.util.*;

//prankuragarwal

public class Assignment5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("Enter radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        MathUtil mu = new MathUtil(num, radius);
        System.out.println("Cube root is: " + mu.cubeRoot(num));
        System.out.println("Circumference is: " + mu.circumference(radius));
        System.out.println("Area is: " + mu.area(radius));
    }
    
}
