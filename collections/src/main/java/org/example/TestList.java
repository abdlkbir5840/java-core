package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        List alist = new ArrayList<>();
        List llist = new LinkedList<>();
        long beforAList, afterAList,beforLList, afterLList;
        System.out.println("Add element in the last index");
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

        System.out.println("Add element in the first index");
        beforAList = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) alist.add(0, i);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) llist.add(0, i);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));

        System.out.println("================================================================");

        System.out.println("Remove element in the first index");
        beforAList = System.currentTimeMillis();
       alist.remove(0);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        llist.remove(0);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));

        System.out.println("================================================================");

        System.out.println("Remove element in the last index");
        beforAList = System.currentTimeMillis();
        alist.remove(alist.size()-1);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        llist.remove(llist.size()-1);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));

        System.out.println("================================================================");

        System.out.println("Add an element to a given position in the list: ");
        beforAList = System.currentTimeMillis();
        alist.add(1485,76);
        afterAList = System.currentTimeMillis();
        System.out.println("ArrayList: The time that has passed is: "+(afterAList - beforAList));

        System.out.println("-----------------------------------------------------------");

        beforLList = System.currentTimeMillis();
        llist.add(1485,76);
        afterLList = System.currentTimeMillis();
        System.out.println("LinkedList: The time that has passed is: "+(afterLList - beforLList));
    }

}