package assignment3_2;

//prankuragarwal

abstract class Restaurant {
    String name;
    String locat;
    String menuIt;
    
    public void printName() {
        System.out.println("Name of restaurant: " + name);
    }
    abstract float totalPrice();
    abstract void menuItems();
    abstract String location();
    
    
}
