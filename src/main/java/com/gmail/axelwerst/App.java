package com.gmail.axelwerst;



    public class App {
        public static void main(String[] args) {
            Stackable.Stack<Integer> stack = new Stackable.Stack<>(3); // Стек з максимальним розміром 3

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
        }
    }





