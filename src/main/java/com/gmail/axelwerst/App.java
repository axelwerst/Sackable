package com.gmail.axelwerst;


import static com.gmail.axelwerst.Sortable.bubbleSort;
import static com.gmail.axelwerst.Sortable.printArray;

public class App {
    public static void main(String[] args) {
           /* Stackable.Stack<Integer> stack = new Stackable.Stack<>(3); // Стек з максимальним розміром 3

            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Спроба додати елемент у повний стек
            stack.push(40); // Виведе: "Стек заповнений. Неможливо додати елемент."

            System.out.println("Верхній елемент: " + stack.peek()); // Виведе: 30

            System.out.println("Дістали елемент: " + stack.pop()); // Виведе: 30
            System.out.println("Дістали елемент: " + stack.pop()); // Виведе: 20
            System.out.println("Дістали елемент: " + stack.pop()); // Виведе: 10

            // Спроба дістати елемент з порожнього стека
            System.out.println("Дістали елемент: " + stack.pop()); // Виведе: "Стек порожній. Немає елементів для діставання."

        */

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        Sortable.printArray(arr);
        Sortable.bubbleSort(arr);
        System.out.println("Sorted array:");
        Sortable.printArray(arr);


        BinarFindble ob = new BinarFindble();
        int[] arrSort = Sortable.bubbleSort(arr);
        int n = arr.length;
        int x = 34;
        int result = ob.BinarFindble(arrSort, 0, n - 1, x);
        if (result == -1) System.out.println("Element is not present in array");
        else System.out.println("Element is present at index " + result);
    }
}







