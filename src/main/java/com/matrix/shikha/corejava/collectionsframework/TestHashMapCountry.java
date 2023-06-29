package com.matrix.shikha.corejava.collectionsframework;

import java.util.HashMap;

public class TestHashMapCountry {

    public String getCountry(String countryCode) {
        HashMap<String, String> map = new HashMap<>();
        map.put("IN", "India");
        map.put("CAN", "Canada");
        map.put("EU", "Europe");
        map.put("SWZ", "Switzerland");
        map.put("AMS", "Amsterdam");

        return map.get(countryCode);
    }

    public static void main(String[] args) {
        String country = new TestHashMapCountry().getCountry("CAN");
        System.out.println(country);
    }

}
