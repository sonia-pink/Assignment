package com.wbl;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(100);
        int count = 0;
        int num1;
        int input = -1;
        System.out.println("guess number between 1 to 100 ");
        Scanner scan = new Scanner(System.in);
        for(int i=1; i<=25; i++) {
            System.out.println(" Make a guess ");
            int a = scan.nextInt();
            if (input != -1 && a == input) {
                System.out.println("you entered consecutively same number");
                count-=1;
            }

            input = a;
            
            count += 1;
            if(num == a)
            {
                System.out.println("* * * * * * ** * * * * ** * * * * * * * ");
                System.out.println("Congratulations! your guess is correct");
                System.out.println("* * * * * * ** * * * * ** * * * * * * * ");
                break;
            }
            else if (num > a)
            {
                System.out.println(" Number is GREATER than your number");
                System.out.println(" Try Again ");
            }
            else if (num < a)
            {
                System.out.println(" Number is LESS than your number");
                System.out.println(" TRY AGAIN ");
            }

        }
        System.out.println("* * * * * * *");
        System.out.println(" GAME DONE ");
        System.out.println(" YOU GOT ANSWER IN "+count +"th" + " GUESS ");
        System.out.println("* * * * * * *");
    }
}
