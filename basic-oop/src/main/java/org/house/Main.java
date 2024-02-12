package org.house;

import org.house.classes.Door;
import org.house.classes.House;
import org.house.classes.Light;
import org.house.classes.Window;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.addDoor();
        myHouse.addDoor();
        for (int i = 0; i < 5; i++) {
            myHouse.addLight();
            myHouse.addWindow();
        }
        System.out.println("----------------------------- Start ---------------------------------");
        System.out.println(myHouse.getDoors());
        System.out.println(myHouse.getWindows());
        System.out.println(myHouse.getLights());

        System.out.println("----------------------------- Random Open Operations ---------------------------------");
        Random random = new Random();
        myHouse.openDoor(random.nextInt(myHouse.getDoors().size()));
        for (int i = 0; i < 3; i++) {
            myHouse.openWindow(random.nextInt(myHouse.getWindows().size()));
        }
        for (int i = 0; i < 3; i++) {
            myHouse.turnOnLight(random.nextInt(myHouse.getLights().size()));
        }
        System.out.println(myHouse.getDoors());
        System.out.println(myHouse.getWindows());
        System.out.println(myHouse.getLights());

        System.out.println("----------------------------- Open All Operations ---------------------------------");
        myHouse.getWindows().forEach(Window::open);
        myHouse.getDoors().forEach(Door::open);
        myHouse.getLights().forEach(Light::on);

        System.out.println(myHouse.getDoors());
        System.out.println(myHouse.getWindows());
        System.out.println(myHouse.getLights());

        System.out.println("----------------------------- Close Operations ---------------------------------");
         myHouse.getWindows().forEach(Window::close);
         myHouse.getDoors().forEach(Door::close);
         myHouse.getLights().forEach(Light::off);

        System.out.println(myHouse.getDoors());
        System.out.println(myHouse.getWindows());
        System.out.println(myHouse.getLights());
    }
}
