package com.learningjava;

public class ValidateOperation {

    public int verify(float num2, int option) {
        int bug = 0;
        if (option == 4 && num2 == 0) {
            System.out.println("it is not possible to divide by zero");
            bug += 1;
        }
        return bug;
    }
}
