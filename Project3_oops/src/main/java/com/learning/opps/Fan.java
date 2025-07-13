package com.learning.opps;

public class Fan {
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;

    public Fan(String color, String make, double radius) {
        this.color = color;
        this.make = make;
        this.radius = radius;
    }
    public void switchOn(){
        this.isOn = true;
        setSpeed((byte)3);

    }
    public void switchOff(){
        this.isOn = false;
        setSpeed((byte)(0));
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}
