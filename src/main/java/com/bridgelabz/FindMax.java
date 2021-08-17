package com.bridgelabz;

public class FindMax {

    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value");
        Integer a1 = 30, a2 = 98, a3 = 28;
        System.out.println("The Maximum between three integers is : " + maxOfInteger(a1, a2, a3));
    }
}
