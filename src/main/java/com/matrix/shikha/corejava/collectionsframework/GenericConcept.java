package com.matrix.shikha.corejava.collectionsframework;

import java.util.ArrayList;

public class GenericConcept {

    public static void main(String[] args) {

        //without Generic
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add("Shikha");

        System.out.println("-------------for each loop--------------");
        for (Object obj : list1) {

            //[10, 20, "Shikha"]

            if (obj instanceof String) {
                //TypeChecking
                String str = (String) obj; //typecasting, converting Object into String
                System.out.println(str.length());
            } else if (obj instanceof Integer) {
                System.out.println(obj);
            } else if (obj instanceof Character) {
                Character ch = (Character) obj;
                System.out.println(ch.charValue());

                System.out.println("----------------");
            }

        }

        //With Generic
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(72);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Shikha");
        list3.add("Shivani");
        System.out.println(list3);

        //[11, 72]
        for (Integer i : list2) {
            System.out.println(i);

        }

        for (String str : list3
             ) {
            System.out.println(str.length());

        }


        }
    }


