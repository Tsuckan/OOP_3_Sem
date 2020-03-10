package com.mirea.lab;

public class Circle {
    private String color;
    private int radius;

    public Circle() {
        color = "none";
        radius = 15;
    }

    public Circle(String n) {
        color = n;
        radius = 1700;
    }

    public Circle(String n, int a) {
        color = n;
        radius = a;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color - '" + color + '\'' +
                ", radius - " + radius +
                '}';
    }


}
