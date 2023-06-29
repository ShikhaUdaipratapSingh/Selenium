package com.matrix.shikha.corejava.stringconcepts;

import java.util.Locale;

public class TestStringMethods extends Object{

    public static void main(String[] args) {
        String str = "Canada";
        System.out.println("Length() :" +str.length());

        char [] ch = {'C', 'a', 'n', 'a', 'd', 'a'};
        String [] strArr = {"Montreal", "Quebec"};

        System.out.println(strArr.length);

        System.out.println(ch.length);

        String str1 = "SHIKHA";
        System.out.println("Length() :" +str1.toLowerCase());

        String str2 = "shikha";
        System.out.println("Length() :" +str2.toUpperCase());

        String str3 = "       Shikha             Singh           ";
        System.out.println(str3.trim());

        String str4 = "Downtown";
        String str5 = "Downtown-ottawa";
        String str6 = "Downtown";
        System.out.println("equals() :" +str4.equals(str5));

        String str7 = "Shikha";
        System.out.println("startsWith() : "+str7.startsWith("Shik"));

        String str8 = "Shikha";
        System.out.println("startsWith() : "+str8.startsWith("hik"));

        String str9 = "Shikha";
        System.out.println("endsWith() : "+str9.endsWith("hik"));
        System.out.println("endsWith() : "+str9.endsWith("hikha"));
        System.out.println("contains() : "+str9.contains("hikh"));

        String str10 = "Montreal"; // M=0, o=1, n=2, t=3, r=4, e=5, a=6, l=7
        System.out.println("replace() : "+str10.replace("e", "E"));
        System.out.println("replace() : "+str10.replace("Montreal", "Toronto"));
        System.out.println("indexof(char) :"+str10.indexOf('M'));
        System.out.println("indexof(String) :"+str10.indexOf("ont"));
        System.out.println("lastIndexOf(char) :"+str10.lastIndexOf('a'));
        System.out.println("isEmpty() :"+str10.isEmpty());
        System.out.println("substring() :"+str10.substring(0));
        System.out.println("substring() :"+str10.substring(1));
        System.out.println("substring() :"+str10.substring(2));
        System.out.println("substring() :"+str10.substring(3));
        System.out.println("substring() :"+str10.substring(4));
        System.out.println("substring() :"+str10.substring(5));
        System.out.println("substring() :"+str10.substring(6));

        System.out.println("------------------------------------------------");

        System.out.println(str10.substring(0,8));
        System.out.println(str10.substring(1,7));
        System.out.println(str10.substring(2,6));
        System.out.println(str10.substring(3,5));

        System.out.println("------------------------------------------------");

        char [] chArr = str10.toCharArray(); // string --> char[]
        String [] st1Arr = {"Mon", "tre", "al"};

        for (char chr : chArr) {
            System.out.println(chr);

        }

        for (String st1: st1Arr) {
            System.out.print(st1 + " ");

        }

        System.out.println();

        for (String st1: st1Arr) {
            System.out.println(st1);

        }

        //System.out.println("-------------for loop------------");

        for (int i = 0; i <=7; i++) {
            System.out.println(chArr[i]);
        }

        String str11 = "Modu gno";
        String [] stArray = str11.split(" ");

        for (String st : stArray) {
            System.out.print(st);

        }

        for (int i = 0; i <= 1; i++) {
            System.out.println(stArray[i]);
        }

        String str12 = "Shikha";
        System.out.println(str12.replaceAll("Shikha", "Singh"));

        TestStringMethods obj = new TestStringMethods();



    }
}
