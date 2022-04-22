package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int lines= in.nextInt();            //number of lines as input
        System.out.println("Enter the number of lines to enter");
        String[] string = new String[lines];
        in.nextLine(); //consuming the <enter> from input above
        for (int i = 0; i < string.length; i++) {
            string[i] = in.nextLine();
        }
        System.out.printf("\nYour input:\n");
        for (String s : string) {
            System.out.println(s);
        }
        System.out.printf("\nReverse Order:\n");
        for (int i = string.length - 1; i >= 0 ; i--) {
            System.out.println(string[i]);
        }
    }
}
