package com.wbl;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=1; i<=num; i++)
        {
             sum = sum+i;
        }
        System.out.println(" Sum of numbers is " +sum);
    }
}
