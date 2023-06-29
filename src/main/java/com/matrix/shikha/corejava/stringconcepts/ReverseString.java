package com.matrix.shikha.corejava.stringconcepts;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println();
        System.out.println(reverse);

    }

}
