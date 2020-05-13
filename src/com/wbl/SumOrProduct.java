package com.wbl;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(" sum-s or Product-p  ");
        System.out.println("Enter s/p");
        String s1 = scan.next();
        char c =  s1.charAt(0);

        switch(c){

            case 's':
                System.out.println(" sum is : " +(1+num));
                break;
            case 'p':
                System.out.println(" Product is : " +(1*num));
                break;
            default:
                System.out.println("case not found ");

        }
    }
}
