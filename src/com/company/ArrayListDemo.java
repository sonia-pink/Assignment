package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("red");
        al.add("blue");
        al.add("green");
        al.add("yellow");
        //System.out.println(al);

        for(String str : al)
        {
            System.out.println(str);
        }
    }
}
