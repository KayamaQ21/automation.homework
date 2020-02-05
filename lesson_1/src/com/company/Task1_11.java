package com.company;

import java.util.Arrays;
import java.util.Scanner;

//заменить все элементы массива на полусумму соседних элементов

public class Task1_11 {
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

        int[] newArray = changeArray(array);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] changeArray(int[] anyArray) {
        int[] newArray = new int[anyArray.length];
        newArray[0] = anyArray[0];
        newArray[anyArray.length - 1] = anyArray[anyArray.length - 1];
        for (int i = 1; i < anyArray.length - 1; i++) {
            newArray[i] = ((anyArray[i - 1] + anyArray[i + 1]) / 2);
        }
        return newArray;
    }
}