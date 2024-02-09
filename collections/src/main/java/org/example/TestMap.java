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
        System.out.println();
        System.out.println("============================ Add ==================================");
        Map<Integer, Integer> numbers1 = new HashMap<>();
        Map<Integer, Integer> numbers2 = new LinkedHashMap<>();
        Map<Integer, Integer> numbers3 = new TreeMap<>();
        long beforHMap, afterHMap,beforLHMap, afterLHMap, beforTMap, afterTMap;
        beforHMap = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            numbers1.put(i,i);
        }
        afterHMap = System.currentTimeMillis();
        System.out.println("HashMap: The time that has passed is: "+(afterHMap - beforHMap));

        beforLHMap = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            numbers2.put(i,i);
        }
        afterLHMap = System.currentTimeMillis();
        System.out.println("LinkedHashMap: The time that has passed is: "+(afterLHMap - beforLHMap));

        beforTMap = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            numbers3.put(i,i);
        }
        afterTMap = System.currentTimeMillis();
        System.out.println("TreeMap: The time that has passed is: "+(afterTMap - beforTMap));
        System.out.println();
        System.out.println("============================= Delete========================================");
        System.out.println();
        beforHMap = System.currentTimeMillis();
        numbers1.remove(200);
        afterHMap = System.currentTimeMillis();
        System.out.println("HashMap: The time that has passed is: "+(afterHMap - beforHMap));

        beforLHMap = System.currentTimeMillis();
        numbers2.remove(200);
        afterLHMap = System.currentTimeMillis();
        System.out.println("LinkedHashMap: The time that has passed is: "+(afterLHMap - beforLHMap));

        beforTMap = System.currentTimeMillis();
        numbers3.remove(200);
        afterTMap = System.currentTimeMillis();
        System.out.println("TreeMap: The time that has passed is: "+(afterTMap - beforTMap));

        System.out.println("============================= Get========================================");
        System.out.println();
        beforHMap = System.currentTimeMillis();
        int value1= numbers1.get(300);
        afterHMap = System.currentTimeMillis();
        System.out.println("HashMap: The time that has passed for get value "+value1+" is: "+(afterHMap - beforHMap));

        beforLHMap = System.currentTimeMillis();
        int value2= numbers2.get(300);
        afterLHMap = System.currentTimeMillis();
        System.out.println("LinkedHashMap: The time that has passed for get value "+value2+" is: "+(afterLHMap - beforLHMap));

        beforTMap = System.currentTimeMillis();
        int value3= numbers3.get(300);
        afterTMap = System.currentTimeMillis();
        System.out.println("TreeMap: The time that has passed for get value "+value3+" is: "+(afterTMap - beforTMap));
    }
}
