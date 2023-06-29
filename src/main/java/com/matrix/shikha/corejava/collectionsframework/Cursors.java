package com.matrix.shikha.corejava.collectionsframework;

import java.util.*;

public class Cursors {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        list.add("Shikha");
//        list.add("Ahmedabad");
//        list.add("Bopal");
//
//        Iterator itr = list.iterator();
//
//        while(itr.hasNext()) {
// //           System.out.println(itr.next());
//        }
//
//        HashSet set = new HashSet();
//        set.iterator();
//
//        Queue queue = new PriorityQueue();
//        queue.iterator();

        //List Iterator: ArrayList, Vector, Stack,LinkedList

        ArrayList list1 = new ArrayList();
        list1.add("Mummy");
        list1.add("Ahmedabad");
        list1.add("Bopal");

        ListIterator li = list1.listIterator();
        li.hasPrevious();

 //       while (li.hasNext()) {
 //           System.out.println(li.next());
 //       }
        li.next();
        li.next();
        li.next();

        while(li.hasPrevious()) {
            System.out.println(li.previous()); //won't print anything as there is nothing before the cursor.
        }

        //Enumeration(interface) works on legacy classes i.e., Vector and Stack
        Vector v = new Vector();
        v.add("Shikha");
        v.add("Preeti");

        Enumeration ee = v.elements();

        while(ee.hasMoreElements()) {
            System.out.println(ee.nextElement());
        }
        Stack st = new Stack();
    }
}
