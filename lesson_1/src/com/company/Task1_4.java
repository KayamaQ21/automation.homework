package com.company;

import java.util.Scanner;

//Найти количество нулевых элементов, вывести количество. Если нулевых элементов нет - вывести сообщение, что их нет

public class Task1_4 {
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

        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                quantity++;
            }
        }
        if (quantity == 0) {
            System.out.println("There are no zeros in the array");
        } else {
            System.out.println("The number of zeros in the array: " + quantity);
        }
    }
}