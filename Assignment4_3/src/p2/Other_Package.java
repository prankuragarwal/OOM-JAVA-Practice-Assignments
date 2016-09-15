package p2;

//prankuragarwal

public class Other_Package {
    p1.Example p_example = new p1.Example();
    
    public void show(){
        System.out.println("Other Package-");
        System.out.println("n_pub = " + p_example.n_pub);
    }
}
