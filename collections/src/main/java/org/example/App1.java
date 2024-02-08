package org.example;

import java.util.*;

public class App1 {
    //Write a Java program to search for an element in an array list.
    public static <T> T search(List<T> list, String element) throws Exception {
        T existing = list.stream()
                .filter(item -> item.toString().toLowerCase().startsWith(element.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new Exception(String.format("Element '%s' not found", element)));
        return existing;
    }

    //Write a Java program to sort a given array list.
    public static List sort(List<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            int index = i;
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(j)<list.get(index)) index=j;
            }
            int temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    public static <T> boolean compareList (List<T> list1, List<T> list2){
        if((list1.size() != list2.size())) return false;
        for (int i = 0; i < list1.size(); i++) {
            if(!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }
    public static <T> List extractSubList (List<T> originalList, int fromIndex, int toIndex){
        if(fromIndex<0 || toIndex <0 || fromIndex>toIndex || originalList.size()<toIndex)
            throw new  IllegalArgumentException("Invalid indices") ;

        List<T> subList = new ArrayList<>();
        for(int i = fromIndex; i<toIndex; i++) subList.add(originalList.get(i));

        return subList;
    }
    //Write a Java program that swaps two elements in an array list.
    public static <T> List swaps(List<T> list, T element1, T element2){
        if(!element1.equals(element2)){
            if(list.contains(element1) && list.contains(element2)){
                int index1 = list.indexOf(element1);
                int index2 = list.indexOf(element2);
                list.set(index1, element2);
                list.set(index2, element1);
            }
        }
        return list;
    }
    //Write a Java program to reverse elements in an array list.
    public static <T> void reverseList(List<T> list){
        int size = list.size();
        for (int i = 0; i < size/2; i++) {
            Collections.swap(list, i, size - i - 1 );
        }
    }
    //Write a Java program to copy one array list into another.
    public static <T> List copy(List<T> list1, List<T> list2){
        if(list1.size()!=list2.size()) throw new IllegalArgumentException("Lists sizes not match");
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list2.get(i));
        }
       return list1;
    }
    //Write a Java program to join two array lists.
    public static <T> void joinlist(List<T> list1, List<T> list2){
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
    }
    //Write a Java program to empty an array list.
    public static <T> void emptyArrayList(List<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
    }
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
        System.out.println("1: Write a Java program to create an array list, add some colors (strings) and print out the collection.");
        colors.add("Red");
        colors.add("white");
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println();
//3. Write a Java program to insert an element into the array list at the first position.
       System.out.println("2: Write a Java program to insert an element into the array list at the first position: {Blue in index 0}");
       colors.add(0,"Blue");
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println();
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("3: Write a Java program to retrieve an element (at a specified index) from a given array list. {index 2}");
        int index = 2;
        if(colors.size()>index){
            System.out.println(colors.get(index));
        }else {
            System.out.println("Index not found");
        }

        System.out.println();
//5. Write a Java program to update an array element by the given element.
        System.out.println("4: Write a Java program to update an array element by the given element. {Red --> Green}");
        String oldElement = "Red";
        String newElement = "Green";
        if(colors.contains(oldElement)){
            int  eleIndex = colors.indexOf(oldElement);
            colors.set(eleIndex, newElement);
        }else {
            System.out.println("Element not found");
        }
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println();
//6. Write a Java program to remove the third element from an array list.
        System.out.println("5: Write a Java program to remove the third element from an array list. {remove: 3}");
        int removerIndex = 3;
        if(colors.size()>removerIndex){
            colors.remove(removerIndex);
        }else {
            System.out.println("Index not found");
        }
        System.out.println();
//7. Write a Java program to search for an element in an array list.
        System.out.println("6: Write a Java program to search for an element in an array list. {search : whi}");
        String searchElement = "whi";
        try {
            String result = search(colors, "whi");
            System.out.println("Founded element: "+result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
//8. Write a Java program to sort a given array list.
        System.out.println("7: Write a Java program to sort a given array list.");
        List<Integer> notes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            notes.add((int)(10 + Math.random()*50));
        }
        System.out.println(notes);
        //Collections.sort(notes);
        sort(notes);
        System.out.println();
        System.out.println(notes);
        System.out.println();
//9. Write a Java program to copy one array list into another.
        System.out.println("8: Write a Java program to copy one array list into another.");
        List<Integer> notes1 = new ArrayList<>();
        List<Integer> notes2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            notes1.add((int)(10 + Math.random()*50));
            notes2.add((int)(10 + Math.random()*50));
        }
        System.out.println(notes1);
        System.out.println(notes2);
        //Collections.copy(notes1, notes2);
        copy(notes1, notes2);
        System.out.println(notes1);
        System.out.println();
//10. Write a Java program to shuffle elements in an array list.
        System.out.println("9: Write a Java program to shuffle elements in an array list.");
        System.out.println(notes);
        Collections.shuffle(notes);
        System.out.println(notes);
        System.out.println();
//11. Write a Java program to reverse elements in an array list.
        System.out.println("10: Write a Java program to reverse elements in an array list.");
        Collections.sort(notes);
        System.out.println(notes);
        //Collections.reverse(notes);
        reverseList(notes);
        System.out.println(notes);
        System.out.println();
//12. Write a Java program to extract a portion of an array list.
        System.out.println("11: Write a Java program to extract a portion of an array list.");
        System.out.println(notes);
        /*
        * from index inclu
        * to index inclu
        * */
        List<Integer> portion1 = notes.subList(1, 4);
        List<Integer> portion2 = extractSubList(notes,1, 4);
        System.out.println(portion1);
        System.out.println(portion2);
        System.out.println();
//13. Write a Java program to compare two array lists.
        System.out.println("12: Write a Java program to compare two array lists.");
        boolean isMatch = compareList(notes1, notes1);
        System.out.println(isMatch);
        System.out.println();
//14. Write a Java program that swaps two elements in an array list.
        System.out.println("13: Write a Java program that swaps two elements in an array list.");
        System.out.println(colors);
        swaps(colors, "white", "Blue");
        System.out.println(colors);
        System.out.println();
//15. Write a Java program to join two array lists.
        System.out.println("14: Write a Java program to join two array lists.");
        List<String> names = new ArrayList<>();
        List<String> list = new ArrayList<>();
        names.add("Ahmed"); names.add("abdelkabir"); names.add("Fatima");
        list.add("Kamal"); list.add("Mohamed"); list.add("Youssef");
        System.out.println(names);
        System.out.println(list);
        joinlist(names, list);
        System.out.println(names);
        System.out.println();

//17. Write a Java program to empty an array list.
        System.out.println("15: Write a Java program to empty an array list.");
        System.out.println(names);
        //names.removeAll(names);
        //names.clear();
        emptyArrayList(names);
        System.out.println(names);
        System.out.println();
//18. Write a Java program to test whether an array list is empty or not.
        System.out.println(names.isEmpty());
        System.out.println(list.isEmpty());

    }
}
