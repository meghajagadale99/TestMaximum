package com.bridgelabz;

public class FindMax {
    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value");
        Integer a1 = 30, a2 = 98, a3 = 28;
        System.out.println("The Maximum between three integers is : " + maxOfValues(a1, a2, a3));
        Float f1 = 4.7f, f2 =12.4f, f3 = 53.2f;
        System.out.println("The Maximum between three float is : " + maxOfValues(f1, f2, f3));
        String s1 = "megha", s2 = "neha", s3 = "rupa";
        System.out.println("The Maximum between three String is : " +maxOfValues(s1, s2, s3));
    }
}