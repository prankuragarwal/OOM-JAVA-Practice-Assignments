package assignment4_1;

//prankuragarwal

public class Assignment4_1 {

    enum Season{   
        WINTER(4), SPRING(2), SUMMER(4), FALL(2);   
  
        private int value;  
        private Season(int value){          
            this.value=value;  
        }  
    }   
    public static void main(String args[]){  
        for (Season s : Season.values())  
            System.out.println(s+" "+s.value);  
    }
}