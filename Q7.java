package com.company;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[] =new int[20];
        System.out.println("How many numbers you want to enter");
        int c =in.nextInt();
        for(int i=0;i<c;i++)
        {
            System.out.println("enter "+(i+1)+"th number");
            arr[i] =in.nextInt();
        }
        product(arr,c);

    }
    static void product(int a[], int n){
        for (int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                int pro =0;
                if(a[i]==a[j])
                continue;
                pro =a[i]*a[j];
                if(pro%2==1)
                {
                    System.out.println("The Product of "+a[i]+" and"+a[j]+" is odd");
                }
            }
        }
    }
}
