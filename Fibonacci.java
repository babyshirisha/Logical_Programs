package com.bridgelabz.twodarray;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int n = 10;
       int firstnum = 0;
       int secnum = 1;
       System.out.println("Fibonacci series of first n num");
       for(int i = 1; i <= n ; i++)
       {
           System.out.println( firstnum );
           int nxt = firstnum + secnum;
           firstnum = secnum;
           secnum = nxt;
       }
    }
}

