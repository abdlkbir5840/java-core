package org.house.classes;

public class Light {
    private boolean isLightOn;

    public Light() {
        this.isLightOn = false;
    }
    public void on(){
        this.isLightOn = true;
    }
    public void off(){
        this.isLightOn = false;
    }

    @Override
    public String toString() {
        return "Light{" +
                "isLightOn=" + isLightOn +
                '}';
    }
}
