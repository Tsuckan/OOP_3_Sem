package com.mirea.lab;

public class MyArrayList<T> {
    private final int INIT_SIZE = 16; //нач размер списка
    private final int CUT_RATE = 4; //исп при изменении размера
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0; //кол-во элементов

    /*
    Добавляет новый элемент в список.
    */
    public void add(T item) {
        if(pointer == array.length-1) //если список почти заполнен ,увеличиваем
            resize(array.length*2); // увеличить список в 2 раза
        array[pointer++] = item; //  добавить элемент
    }

    public T get(int index) {
        return (T) array[index]; // массив с приведением к типу arraylist
    }

    /*
    Удаляет элемент списка по индексу.
    */
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
    }
    /*Возвращает количество элементов в списке*/
    public int size() {
        return pointer;
    }

    // изменение размера массива при удалении/добавлении
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
