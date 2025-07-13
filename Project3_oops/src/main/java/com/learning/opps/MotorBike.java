package com.learning.opps;

public class MotorBike {

    //state
    private String bike;  //member variable
    private int speed;

    public MotorBike(String bike) {  //constructor is special method does not need return type
        this.bike = bike;
    }

    void setSpeed(int speed){   //encapsulation
        if (speed>0)
            this.speed =speed;
    }
    int getSpeed(){
        return this.speed;
    }
    void start(){
        System.out.println(bike + " started");
    }
}
