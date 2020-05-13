package com.wbl;

import java.util.Scanner;

public class SumOfMultiples {
        public void check(int num)
        {
            int sum =0;
            int n1 = num;
            for(int i=1; i<=n1; i++)
            {
                if(i%3==0 || i%5==0)
                {
                    sum =sum +i;
                }
            }
            System.out.println(" Sum of Multiples of 3 and 5 is " +sum);
        }

    public static void main(String[] args) {

        SumOfMultiples s1 =new SumOfMultiples();
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        s1.check(num);
    }
}
