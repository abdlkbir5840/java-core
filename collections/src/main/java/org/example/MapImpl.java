package org.example;

import java.util.*;

public class MapImpl {
    // Write a Java program to associate the specified value with the specified key in a HashMap.
    public static <K, V> void addElement(Map<K, V> map,K key, V value){
        map.put(key, value);
    }
    //Write a Java program to copy all mappings from the specified map to another map.
    public static <K, V> void copy(Map<K, V> from, Map<K, V> to){
        // to.putAll(from);
        for (Map.Entry<K, V> entry : from.entrySet()) {
            to.put(entry.getKey(), entry.getValue());
        }
    }
    //Write a Java program to remove all mappings from a map.
    public static <K, V> void clear(Map<K, V> map){
        // map.clear();
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            keys.add(entry.getKey());
        }
        for (K key: keys) {
            map.remove(key);
        }
    }

    //Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static <K, V> boolean chekEmpty(Map<K, V> map) {
        return map.isEmpty();
    }
    //. Write a Java program to get a shallow copy of a HashMap instance.
    public static <K, V> Map<K, V> shallowCopy(Map<K, V> map) {
       Map<K, V> shalowCopy = new HashMap<>(map);
       return shalowCopy;
    }
    //. Write a Java program to test if a map contains a mapping for the specified key.
    public static <K, V> boolean containsKey(Map<K, V> map, K key) {
        //return map.containsKey(key);
        for (Map.Entry<K, V>entry:map.entrySet()) {
            if(entry.getKey().equals(key))return true;
        }
        return false;
    }
    //. Write a Java program to test if a map contains a mapping for the specified value.
    public static <K, V> boolean containsValue(Map<K, V> map, V value) {
        //return map.containsValue(value);
        for (Map.Entry<K, V>entry:map.entrySet()) {
            if(entry.getValue().equals(value))return true;
        }
        return false;
    }
    //. Write a Java program to create a set view of the mappings contained in a map.
    public static <K, V> Set<Map.Entry<K, V>> createEntrySet(Map<K, V> map) {
        return map.entrySet();
    }
    //. Write a Java program to get the value of a specified key in a map.
    public static <K, V> V getValue(Map<K, V> map, K key) {
        return map.get(key);
    }
    //. Write a Java program to get a set view of the keys contained in this map.
    public static <K, V> Set<K> createEntrySetKeys(Map<K, V> map) {
        return map.keySet();
    }
    //. Write a Java program to get a collection view of the values contained in this map.
    public static <K, V> Collection<V> createEntrySetValues(Map<K, V> map) {
        return map.values();
    }
    public static void main(String[] args) {
        Map<String, Integer> notes = new HashMap<>();
        String [] names = new String[] {"Ahmed", "Abdelkabir","Fatima", "Kamal", "Mohamed"};
        // Write a Java program to associate the specified value with the specified key in a HashMap.
        System.out.println("1: Write a Java program to associate the specified value with the specified key in a HashMap.");
        for (int i = 0; i < 5; i++) {
            notes.put(names[i], (int)(8+Math.random()*12));
        }
        addElement(notes, "Youssef", 15);
        System.out.println(notes);
        System.out.println();
        //. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("2: Write a Java program to count the number of key-value (size) mappings in a map.");
        System.out.println(notes.size());
        System.out.println();
        //. Write a Java program to copy all mappings from the specified map to another map.
        System.out.println("3: Write a Java program to copy all mappings from the specified map to another map.");
        Map<String, Integer> notes2 = new HashMap<>();
        copy(notes, notes2);
        System.out.println(notes2);
        System.out.println();
        //. Write a Java program to remove all mappings from a map.
        System.out.println("4: Write a Java program to remove all mappings from a map.");
        System.out.println(notes2);
        clear(notes2);
        System.out.println(notes2);
        System.out.println();
        //. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("5: Write a Java program to check whether a map contains key-value mappings (empty) or not.");
        boolean b1 = chekEmpty(notes2);
        boolean b2 = chekEmpty(notes);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();
        //. Write a Java program to get a shallow copy of a HashMap instance.
        System.out.println("6: Write a Java program to get a shallow copy of a HashMap instance.");
        System.out.println(notes);
        Map<String, Integer> sholowCopy = shallowCopy(notes);
        System.out.println(sholowCopy);
        System.out.println();
        //. Write a Java program to test if a map contains a mapping for the specified key or specified value.
        System.out.println("7: Write a Java program to test if a map contains a mapping for the specified key.");
        boolean b3 = containsKey(notes,"Ahmed");
        boolean b4 = containsValue(notes,22);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println();
        //. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println("8: Write a Java program to create a set view of the mappings contained in a map.");
        Set<Map.Entry<String, Integer>> entrySet = createEntrySet(notes);
        System.out.println(entrySet);
        for(Map.Entry<String, Integer>entry: entrySet){
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println();
        //. Write a Java program to get the value of a specified key in a map.
        System.out.println("9: Write a Java program to get the value of a specified key in a map.");
        int value = getValue(notes, "Ahmed");
        System.out.println("Ahmed = "+value);
        System.out.println();
        //. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("10: Write a Java program to get a set view of the keys contained in this map.");
        Set<String> set = createEntrySetKeys(notes);
        System.out.println(set);
        System.out.println();
        //. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("11: Write a Java program to get a collection view of the values contained in this map.");
        Collection<Integer> list = createEntrySetValues(notes);
        System.out.println(list);
        System.out.println();
                
    }

}
