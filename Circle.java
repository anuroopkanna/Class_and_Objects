package com.BridgelazCO;

import java.util.Scanner;

public class Circle {
    int radius;
    public void AreaOfCircle(int a)
    {
        int areaofCircel = (int)3.14*radius*radius;
        System.out.println(areaofCircel);
    }
    public void circumferenceOfCircle(int a){
        double circumference  =2*3.14*radius;
        System.out.println(circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter the radius of the circle ");
        c.radius=sc.nextInt();
        c.AreaOfCircle(c.radius);
        c.circumferenceOfCircle(c.radius);
    }
}
