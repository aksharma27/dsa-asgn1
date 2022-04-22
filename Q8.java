package com.company;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a[] =new int[20];
        int b[] =new int[20];
        int c[] =new int[20];
        System.out.println("Enter the length of array");
        int n =in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements in array a[]");
            a[i] =in.nextInt();

            System.out.println("Enter the elements in array b[]");
            b[i] =in.nextInt();
        }

        {
            for(int i=0;i<n;i++) {
                c[i] = a[i] * b[i];
                System.out.println(c[i]);
            }}
    }
}
