package com.mirea.lab;

public class Mops extends Dogs {
    public Mops() {
        this.age = 1;
        this.name = "Max";
    }

    public Mops(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getStatus() {
        if (age > 3) {
            return "Old dog";
        } else {
            return "Puppy";
        }
    }

    @Override
    public String toString() {
        return "Dog : alabai , name - " + this.name + ", age - " + this.age;
    }
}
