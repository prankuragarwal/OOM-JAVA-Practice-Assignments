package assignment2_2;

//prankuragarwal

public class Assignment2_2 extends Student{

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter details for Student 1: ");
        s1.GetData();
        System.out.println("Enter details for Student 1: ");
        s2.GetData();
        System.out.println("Student 1:-");
        s1.SetData();
        System.out.println("Student 2:-");
        s2.SetData();
    }
 
}