package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void testMap(Map<String, Integer> map){
        map.put("Ahmed", 15);
        map.put("Fatima", 20);
        map.put("Abdelkabir", 13);
        map.put("Kamal", 19);
        map.put("Mohamed", 7);
        System.out.println(map);
    }
    public static void main(String[] args) {
        Map<String, Integer> notes1 = new HashMap<>();
        Map<String, Integer> notes2 = new LinkedHashMap<>();
        Map<String, Integer> notes3 = new TreeMap<>();
        System.out.println("------------------------ HashMap ------------------------");
        testMap(notes1);
        System.out.println("------------------------ LinkedHashMap ------------------------");
        testMap(notes2);
        System.out.println("------------------------ TreeMap ------------------------");
        testMap(notes3);

    }
}
