package com.gmail.axelwerst;


public interface Stackable<T> {
    boolean isEmpty();           // Перевірка, чи порожній стек

    boolean isFull();            // Перевірка, чи повний стек

    void push(T element);        // Додавання елемента

    T pop();                     // Діставання елемента

    T peek();                    // Перегляд верхнього елемента
}