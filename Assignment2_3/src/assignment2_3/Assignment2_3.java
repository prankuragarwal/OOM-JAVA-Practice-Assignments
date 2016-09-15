package assignment2_3;
import java.util.*;
import prankur.own.pack.*;

//prankuragarwal

public class Assignment2_3 {
    
    public static void main(String[] args) {
        int inches, feet;
        Scanner sc = new Scanner(System.in);		
	System.out.println("Enter distance 1: ");
	System.out.print("Feet: ");
	feet = Integer.parseInt(sc.nextLine());
	System.out.print("Inches: ");
	inches = Integer.parseInt(sc.nextLine());
	Distance a = new Distance(feet, inches);
	System.out.println("Enter distance 2: ");
	System.out.print("Feet: ");
	feet = Integer.parseInt(sc.nextLine());
	System.out.print("Inches: ");
	inches = Integer.parseInt(sc.nextLine());
	Distance b = new Distance(feet, inches);
	Distance c = new Distance(0, 0);
        c.feet = c.func(a, b).feet;
        c.inches = c.func(a, b).inches;
	System.out.println("Total Distance: ");
	System.out.print("Feet: " + c.feet);
	System.out.print(" Inches: " + c.inches);
    }
    
}
