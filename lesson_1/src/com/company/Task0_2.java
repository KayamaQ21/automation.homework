package com.company;

//Используя for вывести каждое четное число от 2 до 20 включительно

public class Task0_2 {
    public static void main(String[] args) {
        secondCycle();
    }

    public static void secondCycle() {
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
