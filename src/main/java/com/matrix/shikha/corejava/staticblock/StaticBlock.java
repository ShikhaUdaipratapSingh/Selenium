package com.matrix.shikha.corejava.staticblock;

import java.util.SortedMap;

public class StaticBlock {

    static {
        System.out.println("I am in static block.");
    }

    StaticBlock () {
        System.out.println("0-args constructor");
    }

    StaticBlock(int age) {
        System.out.println("1-args constructor");
    }

    StaticBlock(int age, String name) {
        System.out.println("2-args constructor");
    }

    public static void main(String[] args) {
        new StaticBlock();
        new StaticBlock(10);
        new StaticBlock(20, "Shikha");
    }
}
