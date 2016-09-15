package assignment.pkg1;
import java.util.*;

//prankuragarwal

public class Assignment1Q1 extends Employee{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ( "Enter name: ");
        String name = sc.nextLine();
        System.out.print ( "Enter salary: ");
        int sal = sc.nextInt();
        System.out.print ( "Enter years: ");
        int year = sc.nextInt();
        
        Employee e1 = new Employee ( name, sal, year );
        e1.calcbonus();
        double b = e1.bonus;
        
        System.out.println ( "Congratulations ! Your bonus is Rs "+b+"." );
        
    }

    public Assignment1Q1(String x, int s, int y) {
        super(x, s, y);
    }

 
}
