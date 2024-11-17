package com.gmail.axelwerst;

public class Sortable {

    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        if (isSorted(arr)) {
            System.out.println("Array is already sorted.");
            return arr;
        }
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static String printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return null;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        return null;
    }
}
