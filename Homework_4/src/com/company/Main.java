package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[15];
        System.out.print("MASSIVV: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10);
            System.out.print(" ");
            System.out.print(array[i]);
        }
        int sum_c = 0;
        int sum_n = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]%2==0)
                sum_c += array[i];
            else sum_n += array[i];
        }
        System.out.println();
        System.out.println("Summa chetnih=" + sum_c);
        System.out.println("Summa NOTch=" + sum_n);
    }
}