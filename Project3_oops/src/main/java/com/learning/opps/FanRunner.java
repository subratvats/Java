package com.learning.opps;

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("Green","Bajaj",4.55);
        fan.switchOff();
        System.out.println(fan);

        fan.switchOn();
        System.out.println(fan);

        fan.setSpeed((byte)5);
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);
    }
}
