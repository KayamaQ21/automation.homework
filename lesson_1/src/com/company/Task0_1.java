package com.company;

// Используя while, вывести все числа от 0 до 25 в одну строку через пробел
public class Task0_1 {
    public static void main(String[] args) {
        firstCycle();
    }

    public static void firstCycle() {
        int i = 0;
        while (i < 26) {
            System.out.print(i + " ");
            i++;
        }
    }
}
