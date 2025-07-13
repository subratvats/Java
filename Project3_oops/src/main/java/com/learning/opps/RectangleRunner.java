package com.learning.opps;

import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        double length = sc.nextDouble();
        System.out.println("Enter the width ");
        double width = sc.nextDouble();
        Rectangle rec1 = new Rectangle(length, width);

        System.out.println(rec1);
    }
}
