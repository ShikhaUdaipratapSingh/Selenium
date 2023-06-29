package com.matrix.shikha.corejava.stringconcepts;

public class TestStringsImmutability {

    public static void main(String[] args) {

        String str = "Shikha";

        str = str.concat("Singh");

        System.out.println(str);

        StringBuffer strB = new StringBuffer("Upendra");
        strB.append("Shikha");
        System.out.println(strB);
    }
}
