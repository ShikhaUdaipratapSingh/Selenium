package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayListWithMethodReturnType {

    public List<String> getData() {

        List<String>list = new ArrayList<>();
        list.add("Jammu");
        list.add("Punjab");
        list.add("Rajasthan");
        return list;
    }

    public void addItems(List<String> l) {

        for (String str : l
             ) {
            System.out.println(str);

        }

    }

    public static void main(String[] args) {
        TestArrayListWithMethodReturnType obj = new TestArrayListWithMethodReturnType();
                List<String> list = obj.getData();

        System.out.println("--------forloop---------");

                for (int i = 0; i< list.size(); i++ ) {
                    System.out.println(list.get(i));
                }

        System.out.println("--------foreachloop---------");
        for (String str : list) {
            System.out.println(str);

        }
        System.out.println("--------Using ListIterator---------");
        ListIterator<String> itr = list.listIterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----------from Method----------------");
        obj.addItems(list);

    }
}
