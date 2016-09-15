package assignment4_4;

//prankuragarwal

public class Employee {
    
	double basic, salary;
	final int da = 10;
	final int hra = 20;
    String Emp_name, Emp_code, Address, Ph_no;
    
    Employee(String Emp_name, String Emp_code, String Address, String Ph_no, double basic) {
         this.Emp_name = Emp_name;
         this.Emp_code = Emp_code;
         this.Address = Address;
         this.Ph_no = Ph_no;
         this.basic = basic;
    }
    
    void Salary() {
    	salary = basic + (basic * ((double)da)/100) + (basic * ((double)hra)/100);
    }
    
    void show() {
        System.out.println("Name\t:\t" + Emp_name);
        System.out.println("Code\t:\t" + Emp_code);
        System.out.println("Address\t:\t" + Address);
        System.out.println("Phone no.\t:\t" + Ph_no + "\n");
        System.out.println("Basic Pay\t:\tRs." + basic);
        System.out.println("Dearness Allowance\t:\tRs." + (basic * ((double)da)/100));
        System.out.println("House rent Allowance\t:\tRs." + (basic * ((double)hra)/100));
        System.out.println("TOTAL SALARY\t:\t" + salary);
    }
}
