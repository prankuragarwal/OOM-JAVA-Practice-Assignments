package assignment.pkg1.q2;
import java.util.*;

//prankuragarwal

public class Assignment1Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print ( "Enter no. of sheets of paper: " );
        int sheets = s.nextInt();
        
        int stamps;
        
        stamps = sheets/5;
        
        if ( sheets%5 !=0 ) {
            stamps++;
        }
        
        System.out.println ( " No. of stamps required is " + stamps );
 
    }
    
}
