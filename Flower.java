package com.company;

import java.util.Scanner;

public class Flower {
    String name;
    int petals;
    float price;
    void setDetails(String name, int petals, float price){
        this.name=name;
        this.petals=petals;
        this.price=price;
    }
    void getDetails(){
        System.out.println("\n Name \t\t No. of petals \t\t Price");
        System.out.println(" "+name+"   \t\t\t"+petals+"  "+"     \t\t"+price);
    }

    public static void main(String[] args) {
        Flower flower= new Flower();
        System.out.println("Enter the name of flower: ");
        Scanner in = new Scanner(System.in);
//        in.nextLine();
        String name=in.nextLine();
        System.out.println("Enter Number of petals: ");
        int petals =in.nextInt();
        System.out.println("Enter the price: ");
        float price = in.nextFloat();
        flower.setDetails(name, petals, price);
        flower.getDetails();
    }
}
