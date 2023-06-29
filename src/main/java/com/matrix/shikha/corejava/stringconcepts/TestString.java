package com.matrix.shikha.corejava.stringconcepts;

public class TestString {

    public static void main(String[] args) {
        String str = "Shikha";

        //1. BY using Object way.
        String str1 = new String ("Shikha");

        System.out.println("Memory address of str1" +System.identityHashCode(str1));

        //2. By using String literal way
        String str2 = "ShikhaS";

        System.out.println("Memory address of str2" +System.identityHashCode(str2));
    }
}
