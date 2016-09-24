package assignment5_2a;

import com.person.*;
import com.address.*;
import java.util.*;

public class Employee {
    String name;
    public Employee(String name){
        this.name = name;
        Person p = new Person(name);
        Address a = new Address(name);
    }

}

