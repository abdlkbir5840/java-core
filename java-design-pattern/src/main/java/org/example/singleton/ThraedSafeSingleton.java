package org.example.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThraedSafeSingleton {
    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);
    private static volatile ThraedSafeSingleton instance;
    private static boolean delayMe = true;
    private ThraedSafeSingleton(){
        Collections.shuffle(data);
    }
    public static ThraedSafeSingleton getInstance() {
        if(instance==null) {
            synchronized(ThraedSafeSingleton.class){
                if (delayMe){
                    delayMe = false;
                    Thread.currentThread();
                    try {Thread.sleep(1000);} catch (InterruptedException e) {}
                    instance = new ThraedSafeSingleton();
                }
            }
        }
        return instance;
    }
    public void printData() {
        System.out.println(data);
        System.out.println();
    }
}
