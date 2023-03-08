package com.BridgelazCO;

import java.util.Scanner;

public class Banking {
    int balance,accno,cabalance=70000;
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the amout :- ");
        int depoamount=sc.nextInt();
        cabalance=cabalance+depoamount;
        System.out.println("Your current balance is "+cabalance);

    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the amout :- ");
        int withdrawAmount=sc.nextInt();
        cabalance=cabalance-withdrawAmount;
        System.out.println("your current balance is " +cabalance);
    }

    public static void main(String[] args) {
        Banking ba = new Banking();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want \n 1)Deposit \n 2)Withdraw");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1: {
                ba.deposit();
                break;
            }
            case 2:
            {
                ba.withdraw();
                break;
            }
        }
    }
}
