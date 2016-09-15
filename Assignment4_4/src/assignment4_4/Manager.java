package assignment4_4;

//prankuragarwal

public class Manager extends Employee {
	
    Manager(String Emp_name, String Emp_code, String Address, String Ph_no, double basic) {
        super(Emp_name, Emp_code, Address, Ph_no, basic);
        Salary();
    }
    
    void Salary() {
    	super.salary = (super.basic * ((double)super.da)/(100 * 1.0)) + (super.basic * ((double)super.hra)/(100 * 1.0));
    }       
}
