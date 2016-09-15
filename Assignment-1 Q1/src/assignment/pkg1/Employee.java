package assignment.pkg1;

//prankuragarwal

public class Employee {
    String name;
    int sal;
    int years;
    double bonus;
    
    Employee ( String x, int s, int y ) 
    {
        this.name = x;
        this.sal = s;
        this.years = y;
    }
    
    void calcbonus () 
    {
        if ( years <=5 ) {
            bonus = 0.01 * sal;
        } else {
            bonus = 0.02 * sal;
        }       
    }
}
