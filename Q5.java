package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isOdd(num);
        if (ans == true) {
            System.out.println("Odd");
        } else System.out.println("Even");
    }

    static boolean isOdd(int n) {
        while (n > 1) {
            n = n - 2;
        }
        if (n == 1) {
            return true;
        } else return false;
    }
}