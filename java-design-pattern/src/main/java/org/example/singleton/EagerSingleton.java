package org.example.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EagerSingleton {
    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
        Collections.shuffle(data);
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
    public void printData() {
        System.out.println(data);
        System.out.println();
    }
}
