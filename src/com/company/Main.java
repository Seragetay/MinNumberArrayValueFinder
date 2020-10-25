package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] array1 = arrayCreator();
        printArrayValues(array1);
        int minValue = minValueFinder(array1);

    }

    public static int[] arrayCreator(){
        Scanner scanner = new Scanner(System.in);
        int intCount;
        int values;
        System.out.println("Please enter the count of integer you need to enter: \r");
        intCount = scanner.nextInt();
        int[] array = new int[intCount];
        int counter = 1;
        for (int i =0; i<array.length;i++){
            System.out.println("Please enter integer value# " + counter);
            array[i] = scanner.nextInt();
            counter++;

        }
        return array;
    }

    public static void printArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value#" + i + " is " + array[i]);
        }
    }

    public static int minValueFinder(int[] array){
        int minVal = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minVal) {
                minVal = value;
            }
        }
        System.out.println("The minimum value in your array = " + minVal );
        return minVal;
    }
}
