package com.company;

import java.util.Scanner;

//Найти минимальный-максимальный элементы и вывести

public class Task1_8 {
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

        findMaxElement(array);
        findMinElement(array);
    }

    public static void findMaxElement(int array[]) {
        int max = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest element in the array: " + max);
    }

    public static void findMinElement(int array[]) {
        int min = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest element in the array: " + min);
    }
}