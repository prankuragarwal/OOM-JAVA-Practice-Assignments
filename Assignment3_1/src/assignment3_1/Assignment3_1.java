package assignment3_1;
import java.util.*;

//prankuragarwal

public class Assignment3_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int size = 10;
        int []a = new int[10];
        int radius;
        
        Mercedes_Benz_CLA_Class obm1 = new Mercedes_Benz_CLA_Class();
        Mercedes_Benz_SLS_AMG obm2 = new Mercedes_Benz_SLS_AMG();
        Ford_GT obf1 = new Ford_GT();
        Ford_300 obf2 = new Ford_300();
        Ferrari_V8 obfe1 = new Ferrari_V8();
        Ferrariz_488_Spider obfe2 = new Ferrariz_488_Spider();
        
        System.out.println("Mercedes_Benz_SLS_AMG: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
        
        System.out.println("Mercedes_Benz_CLA_Class: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
        
        System.out.println("Ford_300: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
        
        System.out.println("Ford_GT: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
        
        System.out.println("Ferrari_V8: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
        
        System.out.println("Ferrariz_488_Spider: ");
        System.out.println("Enter speeds in Km/hr: ");
        for (i = 0; i < 10; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter radius of wheel in m: ");
        radius = Integer.parseInt(sc.nextLine());
        System.out.println("Average Speed: " + obm1.average(size, a));
        System.out.println("Max Speed: " + obm1.maxSpeed(size, a));
        System.out.println("RPM: " + obm1.Rpm(size, a, radius));
    }
    
}
