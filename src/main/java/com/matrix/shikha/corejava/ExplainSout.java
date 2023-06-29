package com.matrix.shikha.corejava;

public class ExplainSout {

    public static String str = "Shikha";

    public void getLength() {
        System.out.println(ExplainSout.str.length());

        //ExplainSout: Class name
        //str: static variable
        //length(): Method present in String class
    }

    public static void main(String[] args) {
      //  System.out.println();

        //System; class name
        //out: static variable of type PrintStream
        //println : method present in PrintStream class

        ExplainSout obj = new ExplainSout();
        obj.getLength();

        System.out.println();
    }
}
