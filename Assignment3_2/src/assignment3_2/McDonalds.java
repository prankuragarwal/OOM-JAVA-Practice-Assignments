package assignment3_2;
import java.util.*;

//prankuragarwal

public class McDonalds extends Restaurant {
    float totalPrice(float bill) {
        float tPrice;
        
        tPrice = bill + ((float)0.06 * bill);
        
        return tPrice;
    }
    
    @Override
    void menuItems() {
        menuIt = "Burger";
    }
    
    @Override
    String location() {
        return locat;
    }
    
    public boolean hasPlayPlace() {
        String loc = location();
        
        return loc.equals("playplace");
    }
    
    public McDonalds(String nameMcD, String loc) {
        name = nameMcD;
        locat = loc;
    }

    @Override
    float totalPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}