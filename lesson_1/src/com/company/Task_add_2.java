package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Сортировка методом Шелла

public class Task_add_2 {
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

        int gap = array.length / 2;

        int tmp = 0;
        while (gap >= 1) {
            for (int pointer = 0; pointer < array.length; pointer++) {
                for (int i = pointer - gap; i >= 0; i -= gap) {
                    if (array[i] > array[i + gap]) {
                        tmp = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }
}