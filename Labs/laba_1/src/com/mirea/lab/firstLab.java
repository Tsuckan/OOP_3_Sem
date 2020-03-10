package com.mirea.lab;

import java.lang.*;
public class firstLab {
    public static void main(String[] args) {
        // task #1
        System.out.println("Task #1 :");
        int arrSize = 10;
        int[] mas = new int[arrSize];
        int sum_n = 0;
        for (int i = 0; i < arrSize; i++) {
            mas[i] = 0 + (int) (Math.random() * 100);
            sum_n = sum_n + mas[i];
        }
        System.out.println(" Result #1 - " + sum_n);
        // task #2
        System.out.println("Task #2 :");
        System.out.print(" Result #2 - ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        // task #3
        System.out.println("\nTask #3 :");
        String s_num = " ";
        double i_num = 0.00;
        for (int i = 1; i < 11; i++) {
            i_num = 1.0D / i;
            s_num = s_num + " " + Double.toString(i_num);
        }
        System.out.println(" Result #3 - " + s_num);
        // task #4
        System.out.println("Task #4 : \n Result #4 ");

        System.out.print(" non-sort mas : ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n sort mas : ");
        int temp = 0;
        for (int i = 0; i < arrSize; i++) {
            for (int j = 1; j < (arrSize - i); j++) {
                if (mas[j - 1] > mas[j]) {
                    //swap elements
                    temp = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrSize; i++)
            System.out.print(mas[i] + " ");
    }
}
