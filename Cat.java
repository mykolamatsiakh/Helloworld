package com.devcolibri;

public class Cat {
    public int age;
    public String poroda;
    public String name;

     public void say(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return ("Cat: "+name+"(Poroda:"+poroda+", Age"+age+")");
    }
}
