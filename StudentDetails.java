package com.company;

import java.util.Scanner;
 class Student {
    String name;
    int roll;
    double marks;
//    void setData(String name, int roll, double marks){
//        this.name=name;
//        this.roll=roll;
//        this.marks=marks;
//    }
    void setData(String name, int roll, double marks){
        this.name=name; this.roll=roll; this.marks=marks;
    }
    void display(){
        System.out.println("Name:"+name+" "+"Roll: "+roll+" Marks: "+marks);
    }
 }
        public class StudentDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name, roll and marks for all 3 students student");

        Student s1=new Student(); Student s2=new Student();
        Student s3=new Student();

        s1.setData(in.next(), in.nextInt(), in.nextDouble());
        s2.setData(in.next(), in.nextInt(), in.nextDouble());
        s3.setData(in.next(), in.nextInt(), in.nextDouble());
//        in.close();
        s1.display(); s2.display();  s3.display();
    }
}
