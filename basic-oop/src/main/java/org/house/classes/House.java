package org.house.classes;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Door> doors;
    private List<Window> windows;
    private List<Light> lights;
    public House() {
        this.doors = new ArrayList<>();
        this.windows = new ArrayList<>();
        this.lights = new ArrayList<>();
    }

    public List<Door> getDoors() {
        return doors;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public List<Light> getLights() {
        return lights;
    }

    public void addDoor(){
        doors.add(new Door());
    }
    public void addWindow(){
        windows.add(new Window());
    }
    public void addLight(){
        lights.add(new Light());
    }
    public void openDoor(int index){
        if(index >=0 && index < doors.size()){
            doors.get(index).open();
        }
    }
    public void closeDoor(int index){
        if(index >=0 && index < doors.size()){
            doors.get(index).close();
        }
    }
    public void openWindow(int index){
        if(index >=0 && index < windows.size()){
            windows.get(index).open();
        }
    }
    public void closeWindow(int index){
        if(index >=0 && index < windows.size()){
            windows.get(index).close();
        }
    }
    public void  turnOnLight(int index){
        if(index >=0 && index < lights.size()){
            lights.get(index).on();
        }
    }
    public void  turnOffLight(int index){
        if(index >=0 && index < lights.size()){
            lights.get(index).off();
        }
    }
}
