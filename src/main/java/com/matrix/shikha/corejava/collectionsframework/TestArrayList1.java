package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;

public class TestArrayList1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //by default initial capacity of ArrayList is 10 //default constructor
        list.add("Shikha");
        list.add("Montreal");
        list.add("Quebec");

        ArrayList list1 = new ArrayList(20); //parameterized constructor
        list1.add(1);
        list1.add(2);
        //till 20
        list1.add(20);

        ArrayList list2 = new ArrayList(list); // Arraylist Collections
        System.out.println(list2);
    }
}
