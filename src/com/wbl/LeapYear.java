package com.wbl;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        int next;
        int leap;
        LocalDate c = LocalDate.now();
        int currentYear = c.getYear();
        System.out.println(currentYear);
        if((currentYear%4 == 0) || (currentYear%400 ==0) && (currentYear%100 ==0))
        {
                  System.out.println(" Current year is leap year") ;
        }
        System.out.println(" Next 20 Leap years ");
        leap = currentYear;
        for(int i=1; i<=20; i++)
        {
             leap = leap+4;
            System.out.println(leap);
        }

        
    }
}
