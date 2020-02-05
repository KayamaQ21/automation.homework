package com.company;
import java.util.Scanner;

/*
Найти произведения всех элементов массива, вывести
 */

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert array length: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int arrayMultiplier = 10;
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * arrayMultiplier));
            System.out.print(array[i] + " ");
        }
        int arrayProduct = 1;
        for (int i = 0; i < array.length; i++){
            arrayProduct = arrayProduct * array[i];
        }
        System.out.println();
        System.out.println("Product of array elements: " + arrayProduct);
    }
}
