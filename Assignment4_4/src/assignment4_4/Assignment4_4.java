package assignment4_4;
import java.util.*;

//prankuragarwal

public class Assignment4_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double basic;
	String Emp_name, Emp_code, Address, Ph_no;
        System.out.println("Manager: ");
	System.out.print("Enter the employee name : ");
        Emp_name= sc.nextLine();
        System.out.print("Enter the employee code : ");
        Emp_code= sc.nextLine();
	System.out.print("Enter the employee address : ");
	Address= sc.nextLine();
	System.out.print("Enter the employee phone number : ");
	Ph_no= sc.nextLine();
	System.out.print("Enter the basic pay : Rs.");
	basic = Double.parseDouble(sc.nextLine());
	Manager m = new Manager(Emp_name, Emp_code, Address, Ph_no, basic);
        m.show();
        
        System.out.println("Typist: ");
        System.out.print("Enter the employee name : ");
        Emp_name= sc.nextLine();
        System.out.print("Enter the employee code : ");
        Emp_code= sc.nextLine();
	System.out.print("Enter the employee address : ");
	Address= sc.nextLine();
	System.out.print("Enter the employee phone number : ");
	Ph_no= sc.nextLine();
	System.out.print("Enter the basic pay : Rs.");
	basic = Double.parseDouble(sc.nextLine());
	Typist t = new Typist(Emp_name, Emp_code, Address, Ph_no, basic);
        t.show();
        
        System.out.println("Officer: ");
        System.out.print("Enter the employee name : ");
        Emp_name= sc.nextLine();
        System.out.print("Enter the employee code : ");
        Emp_code= sc.nextLine();
	System.out.print("Enter the employee address : ");
	Address= sc.nextLine();
	System.out.print("Enter the employee phone number : ");
	Ph_no= sc.nextLine();
	System.out.print("Enter the basic pay : Rs.");
	basic = Double.parseDouble(sc.nextLine());
	Officer o = new Officer(Emp_name, Emp_code, Address, Ph_no, basic);
        o.show();
        
	}
}
