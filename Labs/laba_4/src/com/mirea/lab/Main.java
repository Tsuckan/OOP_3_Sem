package com.mirea.lab;

public class Main {
    public static void main(String[] args) {

        System.out.println("About planets : ");
        Planets planet1 = new Planets("Earth");
        Planets planet2 = new Planets("Mars");
        planet1.Info();
        planet2.Info();

        System.out.println("\nAbout cars : ");
        Cars car1 = new Cars("BMW",245);
        Cars car2 = new Cars("Mercedes-Benz",260);
        car1.Info();
        car2.Info();

    }
}
