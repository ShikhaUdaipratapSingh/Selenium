package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);

        for (Integer i : set) {
            System.out.println(i);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list.get(1));

        Employee emp1 = new Employee(14010, "Shikha");
        Employee emp2 = new Employee(14011, "Shivani");

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(emp1);
        hashSet.add(emp2);

        for (Employee e : hashSet) {
            System.out.println(e.empId);
            System.out.println(e.empName);

        }

        Set<String> set1 = new HashSet<>();
        set1.add("Hello");

    }
}
