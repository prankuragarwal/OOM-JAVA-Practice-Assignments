package p1;

//prankuragarwal
public class Derived_Example extends Example{
    public void show(){
        System.out.println("Derived Example-");
        System.out.println("n = " + super.n + " n_pub = " + super.n_pub + " n_pro = " + super.n_pro);
    }
}