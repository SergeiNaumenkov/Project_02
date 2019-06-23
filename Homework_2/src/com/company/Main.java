package com.company;

public class Main {

    public static void main(String[] args) {
        char[] array;
        array = new char[12];
        System.out.print("MASSIV:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (char) (Math.random() * 555);
            System.out.print(" ");
            System.out.print(array[i]);
        }
    }
}
