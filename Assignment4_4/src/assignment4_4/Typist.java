package assignment4_4;

//prankuragarwal

public class Typist extends Employee {
	
	Typist(String Emp_name, String Emp_code, String Address, String Ph_no, double basic) {
    	super(Emp_name, Emp_code, Address, Ph_no, basic);
        Salary();
	}
    
    void Salary() {
    	super.Salary();
    }       
}