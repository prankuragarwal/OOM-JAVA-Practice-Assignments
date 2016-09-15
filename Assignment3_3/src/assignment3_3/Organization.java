package assignment3_3;

//prankuragarwal

public class Organization {
    public String orgName;
    public long noOfEmployees;
    
    public void setOrgData(String name, long numEmp) {
        orgName = name;
        numEmp = noOfEmployees;
    }
    
    public int compareOrg(Organization org2) {
        int flag;
        
        if (this.orgName.equals(org2.orgName) && this.noOfEmployees == org2.noOfEmployees) {
            flag = 1;
        } else {
            flag = 0;
        }
        
        return flag;
    }
}