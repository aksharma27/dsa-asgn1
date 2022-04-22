package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a, b and c");
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b= in.nextInt();
        int c=in.nextInt();
        if (a + b == c) {
            System.out.println(a+" + " +b+" = "+c +" is correct");
        }
        else if (a==b-c){
            System.out.println(a+" = "+b+" - "+ c+" is correct");
        }
        else if (a*b==c){
            System.out.println(a+" * "+b+" = " +c+" is correct");
        }
        else if (a+b==c && a==b-c && a*b ==c){
            System.out.println("all are correct");
        }
        else {
            System.out.println("All are wrong");
        }
    }
}
