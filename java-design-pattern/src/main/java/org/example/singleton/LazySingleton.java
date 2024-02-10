package org.example.singleton;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);
    private static LazySingleton instance;
    private LazySingleton(){
        Collections.shuffle(data);
    }
    public static LazySingleton getInstance() {
        if(instance==null) instance = new LazySingleton();
        return instance;
    }
    public void printData() {
        System.out.println(data);
        System.out.println();
    }
}
