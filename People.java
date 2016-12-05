package com.devcolibri;


public class People {
    public String name;
    public   String lastName;
    public   int age;
    public Cat cat;

    @Override
    public String toString() {
        return "People:("+name+lastName+"Age:"+age+ "-"+"has a cat"+cat+")";
    }
}
