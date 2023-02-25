package com.learningjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" *** Welcome to Calculator *** ");
        Menu options = new Menu();
        options.displayMenu();
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        ValidateOption bugOption = new ValidateOption();
        int bugs = bugOption.verifyOption(option);

        if (bugs == 0) {
            EntryData numbers = new EntryData();
            float[] datos = numbers.receiveData();

            ValidateOperation bugOpration = new ValidateOperation();
            int error = bugOpration.verify(datos[1], option);
            if (error == 0) {
                PrintResult totalValue = new PrintResult();
                totalValue.showResults(datos[0], datos[1], option);
            }
        }
    }
}

