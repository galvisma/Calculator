package com.learningjava;

import java.util.Scanner;

public class EntryData {

    public float[] receiveData() {
        Scanner sc = new Scanner(System.in);

        /* Enter First Number */
        System.out.println("Enter First Number");
        float num1 = sc.nextFloat();

        /* Enter Second Number */
        System.out.println("Enter Second Number");
        float num2 = sc.nextFloat();

        float[] numbers = {num1,num2};
        return numbers;
    }
}
