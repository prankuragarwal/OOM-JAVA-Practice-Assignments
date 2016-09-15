package assignment4_2b;
import java.util.*;

//prankuragarwal

public class Assignment4_2B {

    public static void main(String[] args) {
        String one = args[0];
        String two = args[1];
        System.out.println(one);
        System.out.println(two);
        for (int i = 2; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
    
}
