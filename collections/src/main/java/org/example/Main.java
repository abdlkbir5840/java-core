package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List alist = new ArrayList<>();
        List llist = new LinkedList<>();
        long beforAList, afterAList,beforLList, afterLList;

        beforAList = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) alist.add(i);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) llist.add(i);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));

        System.out.println("================================================================");

        beforAList = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) alist.add(0, i);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) llist.add(0, i);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));
    }
}