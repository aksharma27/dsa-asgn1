package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter the lenth of array");
        Scanner in=new Scanner(System.in);
        int len= in.nextInt();
        int[] arr = new int[len];
        for (int i =0; i<len; i++){
            System.out.println("enter "+i+"th element");
            arr[i]=in.nextInt();
        }
        System.out.println("Largest number in the array is: "+max(arr,len));
        System.out.println("Smallest number in the array is : "+min(arr, len));
    }
    static int max(int[] arrmax, int len){
        int max=arrmax[0];
        for (int i=1; i<len; i++){
            if (arrmax[i]>max){
                max=arrmax[i];
            }
        }
        return max;
    } static int min(int[] arrmin, int len){
        int min=arrmin[0];
        for (int i=1; i<len; i++){
            if (arrmin[i]<min){
                min=arrmin[i];
            }
        }
        return min;
    }
}
