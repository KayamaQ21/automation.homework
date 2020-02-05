package com.company;

/*
Разница между i++ и ++i
i++ - операция пост-инкремента. Возвращает значение i до инкремента
++i - операция префикс-инкремента. Возвращает значение i после инкремента
 */

public class Task0_0 {
    public static void main(String[] args) {
        int i = 10;
        int t = 10;

        System.out.println("\"i++\": Variable \"i\" increments and then is printed out. Result: " + ++i);
        System.out.println("\"++t\": Variable \"t\" is printed out and then increments. Result: " + t++);
        System.out.println("\"++t\": Incremented variable \"t\". Result: " + t);
    }
}