package com.matrix.shikha.corejava.collectionsframework;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String>list = new LinkedList();
        list.add("Delhi");
        list.add("Ahmedabad");
        list.addLast("Cochin");
        list.add("Bangalore");
        list.addFirst("Kashmir");
        list.addLast("Kanyakumari");


        for (String st: list ) {
            System.out.println(st);

        }
        System.out.println("--------------------");

        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
