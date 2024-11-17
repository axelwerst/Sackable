package com.gmail.axelwerst;

import java.util.ArrayList;
import java.util.List;

public interface Stackable<T> {
    boolean isEmpty();           // Перевірка, чи порожній стек

    boolean isFull();            // Перевірка, чи повний стек

    void push(T element);        // Додавання елемента

    T pop();                     // Діставання елемента

    T peek();                    // Перегляд верхнього елемента


    public class Stack<T> implements Stackable<T> {
        private final List<T> elements;
        private final int maxSize;

        // Конструктор, який приймає максимальний розмір стека
        public Stack(int maxSize) {
            this.maxSize = maxSize;
            this.elements = new ArrayList<>(maxSize);
        }

        // Перевірка, чи порожній стек
        @Override
        public boolean isEmpty() {
            return elements.isEmpty();
        }

        // Перевірка, чи повний стек
        @Override
        public boolean isFull() {
            return elements.size() == maxSize;
        }

        // Додавання елемента в стек
        @Override
        public void push(T element) {
            if (isFull()) {
                System.out.println("Стек заповнений. Неможливо додати елемент.");
            } else {
                elements.add(element);
            }
        }

        // Діставання верхнього елемента зі стека
        @Override
        public T pop() {
            if (isEmpty()) {
                System.out.println("Стек порожній. Немає елементів для діставання.");
                return null;
            } else {
                return elements.remove(elements.size() - 1);
            }
        }

        // Перегляд верхнього елемента стека без його видалення
        @Override
        public T peek() {
            if (isEmpty()) {
                System.out.println("Стек порожній. Немає верхнього елемента.");
                return null;
            } else {
                return elements.get(elements.size() - 1);
            }
        }
    }

}