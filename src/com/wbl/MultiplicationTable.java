package com.wbl;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; i<=12; i++)
        {
            System.out.println( num + " * " + i +" = "+num*i);
        }
        
    }
}
