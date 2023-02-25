package com.learningjava;

public class ValidateOption {

    public int verifyOption(int option) {
        int bug = 0;
        if (!(option >= 1 && option <= 4)) {
            System.out.println("select a valid option");
            bug += 1;
        }
        return bug;
    }
}
