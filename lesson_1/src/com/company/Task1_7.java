package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.

public class Task1_7 {
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

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            {
                int tmp = array[i];
                array[i] = array[length - i - 1];
                array[length - i - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}