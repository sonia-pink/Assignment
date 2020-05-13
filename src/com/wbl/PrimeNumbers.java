package com.wbl;

public class PrimeNumbers {
    public static void main(String[] args) {

        String primeNumbers = "";
        System.out.println("Prime Numbers between 1 to 100 ");
        for (int num=1; num<=100; num++)
        {

            int counter = 0;
            for(int i=num; i>=1; i--)
            {
               if (num % i == 0)
               {
                   counter = counter + 1;
               }
            }
            if(counter == 2)
            {
                primeNumbers = primeNumbers + num + " ";
            }
        }
        System.out.println( "Prime Numbers ");
        System.out.println(primeNumbers );
    }
}
