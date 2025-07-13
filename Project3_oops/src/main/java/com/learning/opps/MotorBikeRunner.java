package com.learning.opps;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike("ducati");
        MotorBike honda = new MotorBike("honda");

        ducati.setSpeed(100);
        honda.setSpeed(80);
        ducati.start();
        honda.start();
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
