package com.matrix.shikha.corejava.collectionsframework;

import java.util.HashMap;

public class TestHashMapMethods {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("AMD", "Ahmedabad");
        map.put("PNQ", "Pune");
        map.put("VNS", "Varanasi");
        map.put("YUL", "Montreal");
        map.put("AMD", "Ahmednagar");
        map.put(null, "Jaunpur");
        map.put(null, "Mumbai");
        map.put("BOM", null);
        map.put("JNP", null);

        System.out.println(map.entrySet());

        System.out.println(map.get("AMD"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.containsKey("YUL"));
        System.out.println(map.containsKey("PNB"));
        System.out.println(map.containsValue("Ahmedabad"));
        System.out.println(map.containsValue("Baroda"));
        System.out.println(map.isEmpty());
        System.out.println(map.remove("YUL"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map);
    }
}
