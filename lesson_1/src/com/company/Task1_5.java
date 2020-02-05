package com.company;

import java.util.Scanner;

//Найти и вывести номер нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет

public class Task1_5 {
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

        String idx = "";
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                idx = idx + i + " ";
                quantity++;
            }
        }
        System.out.println((quantity == 0) ? "There are no zeros in the array" : "Indices for zeros: " + idx);
    }
}