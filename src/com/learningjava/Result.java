package com.learningjava;

public class Result {

    public float getResult(float num1, float num2, int option) {
        Calculator cal = new Calculator();
        float total = 0;

        switch (option) {
            case 1:
                total = cal.add(num1, num2);
                break;
            case 2:
                total = cal.subtract(num1, num2);
                break;
            case 3:
                total = cal.multiply(num1, num2);
                break;
            case 4:
                total = cal.division(num1, num2);
                break;
            default:
                break;
        }
        return total;
    }
}
