package assignment5_2a;

import com.person.*;
import com.address.*;
import java.util.*;

public class Assignment5_2A {

    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Employee e = new Employee(name);
    }
    
}
