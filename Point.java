package com.company;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Point {
    double x2, x1, y1, y2;
    double xx=0; double yy=0;
     static void setPoint(double x2, double x1, double y2, double y1){
        x1=x1;
        x2=x2;
        y2=y2;
        y1=y1;
//        double xx=x2-x1;
//        double yy= y2-y1;
    }

    double fintDistance(double x2, double x1, double y2, double y1){
        double dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return dist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x2, x1: ");
        double x2=in.nextDouble(); double x1=in.nextDouble();
        System.out.println("Enter y2, y1: ");
        double y2=in.nextDouble();
        double y1=in.nextDouble();
        Point point= new Point();
        point.setPoint(x2,x1,y2,y1);
        double dist=point.fintDistance(x2,x1,y2, y1);
        System.out.println("Dist: "+dist);

    }
}
