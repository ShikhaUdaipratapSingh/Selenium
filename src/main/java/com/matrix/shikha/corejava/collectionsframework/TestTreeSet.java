package com.matrix.shikha.corejava.collectionsframework;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(11);
        set.add(21);
        set.add(13);

        System.out.println("Ascending order: " +set);

        System.out.println("Descending order: " +set.descendingSet());



    }
}
