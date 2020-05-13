package com.wbl;

import java.util.Scanner;

public class AliceOrBob {

     public void getName(String s1)
     {
         String n1 = s1;
         if(n1.equalsIgnoreCase("Alice"))
         {
             System.out.println(" Hello Alice");
         }
         else if (n1.equalsIgnoreCase("Bob"))
         {
             System.out.println("Hello Bob");
         }
         else{
             System.out.println(" Name does not match to Alice and Bob");
         }

     }




    public static void main(String[] args) {

        AliceOrBob name = new AliceOrBob();
        System.out.println("Enter your Name ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        name.getName(s1);

    }


}
