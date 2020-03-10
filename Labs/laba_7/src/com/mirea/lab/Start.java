package com.mirea.lab;

public class Start {
    public static void main(String[] args) {
        MyArrayList<Object> first = new MyArrayList<Object>(); // создаем список

        first.add("first"); //добавление элемента
        first.add("second"); // добавление элемента

        System.out.println("size = "+first.size()); //вывод размера списка
        System.out.println("first elem = "+first.get(0)); // вывод первого элемента
        System.out.println("second elem = "+first.get(1)); // вывод второго элемента

    }
}
