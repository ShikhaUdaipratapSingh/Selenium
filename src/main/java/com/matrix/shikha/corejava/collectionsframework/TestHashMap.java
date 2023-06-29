package com.matrix.shikha.corejava.collectionsframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("AMD", "Ahmedabad");
        map.put("PNQ", "Pune");
        map.put("VNS", "Varanasi");
        map.put("YUL", "Montreal");

        System.out.println(map);

        Set<Map.Entry<String, String>> set = map.entrySet();

        //by using iterator

        Iterator<Map.Entry<String, String>> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //by using for each loop

        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "------" + entry.getValue());

        }
    }
}
