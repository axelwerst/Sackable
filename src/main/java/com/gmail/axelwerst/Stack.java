package com.gmail.axelwerst;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack<T> implements Stackable<T> {
    private final List<T> elements;
    private final int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new ArrayList<>(maxSize);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean isFull() {
        return elements.size() == maxSize;
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            throw new Exceptions.StackFullException("Стек заповнений. Неможливо додати елемент.");
        }
        elements.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new Exceptions.StackEmptyException("Стек порожній. Немає елементів для діставання.");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new Exceptions.StackEmptyException("Стек порожній. Немає верхнього елемента.");
        }
        return elements.get(elements.size() - 1);
    }
    public Optional<T> popOptional() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(elements.remove(elements.size() - 1));
    }
}
