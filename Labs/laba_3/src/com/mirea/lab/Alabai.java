package com.mirea.lab;

public class Alabai extends Dogs {
    public Alabai() {
        this.age = 1;
        this.name = "Max";
    }

    public Alabai(String name, int age) {
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


