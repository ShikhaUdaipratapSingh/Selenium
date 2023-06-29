package com.matrix.shikha.corejava.collectionsframework;

import java.util.*;

public class TestUtilityClasses {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0 Manhattan");
        list.add("3 NewYork");
        list.add("1 Missouri");
        list.add("2 Ohio");

        System.out.println("-----------Before Sorting-----------" +list);
        Collections.sort(list);
        System.out.println("-----------After sorting-----------" +list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("-----------After reverseorder-----------" +list);

        System.out.println("-----------Max value-----------" +Collections.max(list));

        System.out.println("-----------Min value-----------" +Collections.min(list));

        int marks[] = {10, 20, 30, 40, 50};
        Arrays.sort(marks);

        for ( int mark: marks ) {
            System.out.println(mark);

        }
    }
}
