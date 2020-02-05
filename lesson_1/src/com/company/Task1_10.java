package com.company;

import java.util.Scanner;

//Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)

public class Task1_10 {
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

        checkArray(array);
    }

    public static void checkArray(int[] anyArray) {
        boolean counter = true;
        for (int i = 0; i < anyArray.length - 1; i++) {
            if (anyArray[i] >= anyArray[i + 1]) {
                counter = false;
                break;
            }
        }
        System.out.println((counter) ? "This array is increasing" : "This array is not increasing");
    }
}