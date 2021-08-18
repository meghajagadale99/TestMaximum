package com.bridgelabz;
import java.util.Arrays;
public class FindMax<T extends Comparable<T>> {

    T[] elements;

    public FindMax(T[] elements) {
        this.elements = elements;
    }

    
    public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
        Arrays.sort(elements);
        int length = elements.length;
        T max = elements[length - 1];
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer[] intMax ={ 30, 98, 28, 23 ,45,};
        System.out.println("The Maximum between three integers is : " + maxOfValues(intMax));
        Float[] floatMax = {4.7f, 12.4f, 53.2f, 3.67f, 23.5f};
        System.out.println("The Maximum between three float is : " + maxOfValues(floatMax));
        String[] stringMax = {"megha", "neha", "pranali", "alka", "prakash"};
        System.out.println("The Maximum between three String is : " +maxOfValues(stringMax));
    }
}