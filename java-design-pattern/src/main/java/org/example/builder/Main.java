package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .fname("Abdelkabir")
                .build();
        Person person2 = new Person.Builder()
                .fname("Abdelkabir")
                .lname("el bahmadi")
                .build();
        Person person3 = new Person.Builder()
                .fname("Abdelkabir")
                .lname("el bahmadi")
                .email("admin@gmail.com")
                .build();
        Person person4 = new Person.Builder()
                .fname("Abdelkabir")
                .lname("el bahmadi")
                .email("admin@gmail.com")
                .age(56)
                .build();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }
}
