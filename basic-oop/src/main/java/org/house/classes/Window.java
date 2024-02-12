package org.house.classes;

public class Window {
    private boolean isOpen;

    public Window() {
        this.isOpen = false;
    }
    public void open(){
        this.isOpen = true;
    }
    public void close(){
        this.isOpen = false;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}
