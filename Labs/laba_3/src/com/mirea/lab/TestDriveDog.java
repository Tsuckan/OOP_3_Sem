package com.mirea.lab;

public class TestDriveDog {

    public static void main(String[] args) {

        System.out.println("First dog : ");

        Dogs d1 = new Alabai("Max", 5);
        System.out.println(d1);
        System.out.println(d1.getStatus());

        System.out.println("\nSecond dog : ");

        Dogs d2 = new Mops("Alena", 2);
        System.out.println(d2);
        System.out.println(d2.getStatus());
    }
}
