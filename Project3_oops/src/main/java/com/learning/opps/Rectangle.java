package com.learning.opps;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            this.length =1;
        }
        else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (length<0){
            this.length =1;
        }
        else {
            this.width = width;
        }
    }

    public double Area(){
        return length*width;
    }
    public double Perimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + Area() +
                ", Perimeter=" + Perimeter() +
                '}';
    }
}
