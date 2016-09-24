package com.address;

public class Address {
    String name;
    public Address(String name){
        this.name = name;
    //}
    //{
        System.out.println("From address: " + name);
    }
    public void show(){
        System.out.println("From address: " + name);
    }
}
