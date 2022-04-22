package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int q=0;
        if (a > 2) {
            for (int i=a; i>2; i++){
                i/=2;
                q++;
            }
            System.out.println(q);
        }
        else {
            System.out.println("Input is less than 2");
        }
    }
}
