package com.company;

import java.util.Arrays;
import java.util.Scanner;

// каждый 3-й элемент умножить на 2 (2-мя способами)

public class Task1_3 {
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
        firstMethod(array);
        secondtMethod(array);
    }

    public static void firstMethod(int[] anyArray) {
        int multiplier = 2;
        int step = 3;
        for (int i = 2; i < anyArray.length; i += step) {
            anyArray[i] = anyArray[i] * multiplier;
        }
        System.out.println("First|New array with every third element multiplied by 2: " + Arrays.toString(anyArray));
    }

    public static void secondtMethod(int[] anyArray) {
        int multiplier = 2;
        int step = 3;
        int i = 2;
        while (i < anyArray.length) {
            anyArray[i] = anyArray[i] * multiplier;
            i = i + step;
        }
        System.out.println("Second|New array with every third element multiplied by 2: " + Arrays.toString(anyArray));
    }
}