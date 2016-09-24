package com.person;

public class Person {
    String name;
    public Person(String name){
        this.name = name;
    //}
    //{
        System.out.println("From person: " + name);
    }
    public void show(){
        System.out.println("From person: " + name);
    }
}
