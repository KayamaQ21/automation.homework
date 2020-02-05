package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Циклически сдвинуть все элементы вправо на 2 позиции

public class Task1_12 {
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

        changeArrayToRight(array);
    }

    public static void changeArrayToRight(int[] anyArray) {
        int step = 2;
        int length = anyArray.length;
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < length - step) {
                newArray[i + step] = anyArray[i];
            } else {
                newArray[i + step - length] = anyArray[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}