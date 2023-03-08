package com.BridgelazCO;

import java.util.Scanner;

public class Student {
    int age,id;
    String name;
    public void display(int id, int age,String name){
        System.out.println("Name of the student is "+name);
        System.out.println("Id of the student is "+id);
        System.out.println("Age of the student is "+age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student S = new Student();
        System.out.println("Enter the name of the student:-");
        S.name=sc.next();
        System.out.println("Enter age of the student:-");
        S.age=sc.nextInt();
        System.out.println("Enter id of the student : - ");
        S.id=sc.nextInt();
        S.display(S.id,S.age,S.name);
    }
}