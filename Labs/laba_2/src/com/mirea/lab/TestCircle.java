package com.mirea.lab;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle("Red", 15);
        Circle c2 = new Circle("Blue",15);
        Circle c3 = new Circle();

        System.out.println("New size Circle 2 - " + 20);
        c2.setRadius(20);

        System.out.println("Set parameters circle 3, color - black, size -" + 25 + "\n");
        c3.setColor("Black");
        c3.setRadius(25);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
