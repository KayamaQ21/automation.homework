package com.company;

import java.util.Scanner;

//пройти по массиву и поменять местами каждые 2 соседних элемента

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert array length: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int arrayMultiplier = 10;
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * arrayMultiplier));
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int tmp = 0;
        int step = 2;
        int length = array.length;

        if (length % 2 == 0) {
            for (int i = 0; i < length; i += step) {
                {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        } else {
            for (int i = 0; i < length - 1; i += step) {
                {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}