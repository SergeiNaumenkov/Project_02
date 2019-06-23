package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("VVEDI RAZMER MASSIVA: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.print("MASSIV:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2);
            System.out.print(array[i] + " ");
        }
            int nll = 0;
            int one = 0;
            for(int i = 0; i < array.length; i++)
                if (array[i] == 0 & array[i+1] == 0) nll++;
                else if(array[i] == 1 & array[i+1] ==1) one++;
            System.out.println();
            System.out.println("0 встречается " + nll + " раз подряд");
            System.out.println("1 встречается " + one + " раз подряд");

    }
}