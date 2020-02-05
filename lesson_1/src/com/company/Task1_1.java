package com.company;

import java.util.Scanner;

/*
Пройти по массиву, вывести все элементы в прямом и в обратном порядке
 */

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert array length: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int arrayMultiplier = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * arrayMultiplier));
        }
        //Direct order
        System.out.print("Direct order array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Reverse order
        System.out.print("Reverse order array: ");
        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}