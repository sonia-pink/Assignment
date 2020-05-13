package com.wbl;

import java.util.Scanner;

public class GreetWithName {
    public static void main(String[] args) {
        System.out.println("Enter your Name ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(" Hello " +name);
    }
}
