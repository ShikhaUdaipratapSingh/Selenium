package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class TestCollection {

    public static void main(String[] args) {
        Collection obj = new ArrayList();  //as collection is parent and arraylist is child
        ArrayList obj1 = new ArrayList();


        obj1.add(10); //converts into object
        obj1.add(30); //1st index
        obj1.add("Shikha"); //2nd index
        obj1.add('S'); //3rd index
        obj1.add(10.2); //4th index

        ArrayList obj2 = new ArrayList();
        obj2.add(50);
        obj2.add(60);

        obj1.addAll(obj2);

        System.out.println(obj1);
        System.out.println(obj1.get(2));
        System.out.println(obj1.size()); //same as length in array
        System.out.println(obj1.isEmpty());
        System.out.println(obj2.isEmpty());

        obj1.remove(1);
        obj1.remove(3);
        System.out.println(obj1);
        ListIterator itr = obj2.listIterator(); //method present in arraylist class with return type ListIterator(interface).
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------------");
        ArrayList obj3 = new ArrayList();

        obj3.add("Shikha");
        obj3.add("Singh");
        obj3.add("Montreal");
        System.out.println(obj3);
        System.out.println("--------listIterator---------");

        ListIterator itr1 = obj3.listIterator();

        //[Shikha, Singh, Montreal]

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("----------By using forLoop----------");

        for (int i = 0; i <= 4; i++) {
            System.out.println(obj1.get(i));

            //obj1.get(0); and so on
            }

        System.out.println("----------By using forLoop----------");  //dynamic size

        for (int i = 0; i <= obj1.size()-3; i++) {
            System.out.println(obj1.get(i));

            //obj1.get(0); and so on
        }

        System.out.println("----------By using for each Loop----------");  //

        for (Object o : obj1) {
            System.out.println(o);

        }
    }
}
