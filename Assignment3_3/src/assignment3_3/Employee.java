package assignment3_3;
import java.util.*;

//prankuragarwal

public class Employee extends Organization {
    String empName;
    String sex;
    String jobTitle;
    String birthDate;
    
    public void setEmpData(String name, String gender, String title, String birthdate, String nameOfOrg) {
        empName = name;
        sex = gender;
        jobTitle = title;
        birthDate = birthdate;
        orgName = nameOfOrg;
    }

    public int compareEmp(Employee emp2) {
        int flag;
        
        if (this.empName.equals(emp2.empName) && this.sex.equals(emp2.sex) && this.jobTitle.equals(emp2.jobTitle) && this.birthDate.equals(emp2.birthDate) && this.orgName.equals(emp2.orgName)) {
            flag = 1;
        } else {
            flag = 0;
        }
        
        return flag;
    }
}