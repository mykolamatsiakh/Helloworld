package com.devcolibri;

public class Main {

   static int man[] =new int [10];
    public static void main(String[] args) {



       for (int i=man.length-1;i>=0;i--){
           man[i] = i + 1;
           System.out.println(man[i]);
        }


    }
}

