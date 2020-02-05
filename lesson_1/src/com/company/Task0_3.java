package com.company;

//Используя for вывести каждое четное число от 2 до 20 включительно и больше 10

public class Task0_3 {
    public static void main(String[] args) {
        thirdCycle();
    }

    public static void thirdCycle() {
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0 && i > 10) {
                System.out.print(i + " ");
            }
        }
    }
}
