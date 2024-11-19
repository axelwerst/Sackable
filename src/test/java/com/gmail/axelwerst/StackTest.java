package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testStackFullException() {
        Stack<Integer> stack = new Stack<>(2); // Створюємо стек з максимальним розміром 2

        try {
            // Додаємо елементи до стека
            stack.push(1);
            stack.push(2);

            // Спроба додати третій елемент, очікуємо StackFullException
            stack.push(3);
            fail("Очікується StackFullException, але виняток не був кинутий");
        } catch (Exceptions.StackFullException e) {
            // Перевіряємо, чи повідомлення про помилку правильне
            assertEquals("Стек заповнений. Неможливо додати елемент.", e.getMessage());
        }
    }


    @Test
    void testStackEmptyException() {
        Stack<Integer> stack = new Stack<>(2); // Створюємо порожній стек

        try {
            // Спроба дістати елемент з порожнього стека, очікуємо StackEmptyException
            stack.pop();
            fail("Очікується StackEmptyException, але виняток не був кинутий");
        } catch (Exceptions.StackEmptyException e) {
            // Перевіряємо, чи повідомлення про помилку правильне
            assertEquals("Стек порожній. Немає елементів для діставання.", e.getMessage());
        }
    }

    @Test
    void testPushAndPop() throws Exceptions.StackFullException, Exceptions.StackEmptyException {
        Stack<Integer> stack = new Stack<>(3);

        // Додаємо елементи
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Перевіряємо послідовність вилучення (LIFO)
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());

        // Перевіряємо, що стек тепер порожній
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek() throws Exceptions.StackFullException, Exceptions.StackEmptyException {
        Stack<Integer> stack = new Stack<>(3);

        // Додаємо елемент і перевіряємо верхній
        stack.push(100);
        assertEquals(100, stack.peek());

        // Стек залишається незмінним
        assertEquals(100, stack.pop());
        assertTrue(stack.isEmpty());
    }
}
