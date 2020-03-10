package com.mirea.lab;

import java.io.*;
import java.util.Scanner;

public class WriteText {

        public static void main(String[] args) throws IOException {
            // название файла
            System.out.println("Введите название файла - ");
            Scanner sc1 = new Scanner(System.in);
            String fileName = sc1.nextLine();
            fileName = fileName.trim() + ".txt";
            // создание файла
            File file = new File(fileName);
            file.createNewFile();
            //запись в файл
            FileWriter writer = new FileWriter(file);
            System.out.println("Введите текст, который хотите записать в файл - ");
            //ввод текста
            Scanner sc2 = new Scanner(System.in);
            String text = sc2.nextLine();
            // запись введенного текста
            writer.write(text.trim());
            writer.flush();
            writer.close();
            System.out.println("Текст :{ "+text+" } записан в корневую папку проекта в файл " + fileName);
        }
}

