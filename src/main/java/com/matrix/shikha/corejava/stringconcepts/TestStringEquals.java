package com.matrix.shikha.corejava.stringconcepts;

public class TestStringEquals {

    public static void main(String[] args) {

        String str1 = new String("Shikha");
        String str2 = new String("Upendra");
        String str3 = new String("Shivani");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        String str4 = new String("Mumma");
        String str5 = new String("Papa");
        String str6 = new String("Shikha");
        System.out.println(str4.equals(str5));
        System.out.println(str5.equals(str1));
        System.out.println(str6.equals(str1));


    }
}
