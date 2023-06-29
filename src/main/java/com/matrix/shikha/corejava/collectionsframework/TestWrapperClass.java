package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;

public class TestWrapperClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add('c');

        int a = 10;

        //Primitive datatypes    wrapper classes
        //    int                     Integer
        //    char                    Character
        //    short                   Short
        //     long                   Long
        //    boolean                  Boolean
        //    float                   Float
        //    byte                    Byte
        //    double                 Double

        int a1 = 10;
        System.out.println(a1);

        Integer i = a1;
        System.out.println(i); //Autoboxing


        Integer b = 20;
        System.out.println(b);

        String str = "100";
        String str1 = "200";

        int k = Integer.parseInt(str);
        Integer k1 = Integer.valueOf(str);
        int j = Integer.parseInt(str1);
        Integer j1 = Integer.valueOf(str1);

        System.out.println(str+str1); //output = 100200 //concatenation
        System.out.println(k+j); //output will be 100+200 = 300
        System.out.println(k1+j1);
    }
}
