package com.BridgelazCO;

import java.util.Scanner;

public class Employee {
    int salary,id, total_salary;
    String name;
    public void salary(int sal){
        // sal = 1 month
        //total sal is 12 month
        total_salary=salary*12;

    }
    public void display(){
        System.out.println("name of the employee is " +name);
        System.out.println("total sal of the employee is " + total_salary);
        System.out.println("id of the employee is "+id);

    }
    public static void main(String[] args) {
        Employee e= new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter name of the emp:");
        e.name=sc.next();
        System.out.println("Enter salary of the emp:");
        e.salary=sc.nextInt();
        System.out.println("Enter Id of the employee:");
        e.id=sc.nextInt();
        e.salary(e.salary);
        e.display();
    }

}
