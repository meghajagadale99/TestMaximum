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
        System.out.printf("Maximum value of three is %s :  ", max);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program to find maximum value using generics");
        Integer[] intMax ={ 30, 98, 28, 23 ,45,};
        maxOfValues(intMax);
        Float[] floatMax = {4.7f, 12.4f, 53.2f, 3.67f, 23.5f};
        maxOfValues(floatMax);
        String[] stringMax = {"megha", "neha", "pranali", "alka", "prakash"};
        maxOfValues(stringMax);
    }
}