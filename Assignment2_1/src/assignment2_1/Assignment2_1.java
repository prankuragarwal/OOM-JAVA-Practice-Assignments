package assignment2_1;
import java.util.*;

//prankuragarwal

public class Assignment2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, x;
        int[] arr = new int[10];
        for (i = 0 ; i < 10; i++){
            System.out.println("Enter a number: ");
            x = Integer.parseInt(sc.nextLine());
            arr[i] = x;
        }
        int ansa, ansb, ansc;
        ansa = sumall(arr, 10);
        ansb = sumfirst(arr, 10);
        ansc = sumlast(arr, 10);
        
        System.out.println("Sum of all: " + ansa);
        System.out.println("Sum of first 5: " + ansb);
        System.out.println("Sum of last 5: " + ansc);
    }

    private static int sumall(int[] arr, int size) {
        int sum = 0;
        int i;
        for (i = 0 ;  i < size; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    private static int sumfirst(int[] arr, int size) {
        int sum = 0;
        int i;
        for (i = 0 ;  i < 5; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    private static int sumlast(int[] arr, int size) {
        int sum = 0;
        int i;
        for (i = 5 ;  i < size; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    
}
