package com.devcolibri;

public class Main {
    public static void main(String[] args){
        int val=calcSum(-4,4);
        System.out.println(val);
    }
static int calcSum(int a, int b){
        int sum =a+b;
        if(sum == 0)
        {
          sum=calcSum(4,4);
        }
    return sum;
}

    }

