package assignment2_2;
import java.util.*;

//prankuragarwal

public class Student {
    private int roll;
    private String name;
    private int age;
    
    Scanner sc = new Scanner(System.in);
    
    void GetData() {
        System.out.println("Enter roll number: ");
        roll = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
    }

    void SetData() {
        System.out.println("Roll Number: " + roll + " Name: " + name + " Age: " + age);
    }
}
