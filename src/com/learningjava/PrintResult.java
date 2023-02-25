package com.learningjava;

public class PrintResult {
    public void showResults(float num1, float num2, int option) {

        Result totalValue = new Result();
        float total = totalValue.getResult(num1, num2, option);

        switch (option) {
            case 1:
                System.out.println("The Sum of \n" + num1 + "  +  " + num2 + "  =  " + total);
                break;
            case 2:
                System.out.println("The Subtract of \n" + num1 + "  -  " + num2 + "  =  " + total);
                break;
            case 3:
                System.out.println("The Multiplication of \n" + num1 + "  *  " + num2 + "  =  " + total);
                break;
            case 4:
                System.out.println("The Division of \n" + num1 + "  /  " + num2 + "  =  " + total);
                break;
        }
    }
}

