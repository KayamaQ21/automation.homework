package com.company;

import java.util.Scanner;

//найти номер минимального-максимального элементов и вывести

public class Task1_9 {
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

        findIndexOfMaxElement(array);
        findIndexOfMinElement(array);
    }

    public static void findIndexOfMaxElement(int array[]) {
        int maxIndex = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        System.out.println("The index of the biggest element in the array: " + maxIndex);
    }

    public static void findIndexOfMinElement(int array[]) {
        int minIndex = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.println("The index of the smallest element in the array: " + minIndex);
    }
}