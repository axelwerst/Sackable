package com.gmail.axelwerst;

public class Exceptions {

    public static class StackFullException extends RuntimeException {
        public StackFullException(String s) {
            super("Стек заповнений. Неможливо додати елемент.");
        }
    }

    public static class StackEmptyException extends RuntimeException {
        public StackEmptyException(String s) {
            super("Стек порожній. Немає елементів для діставання.");
        }
    }

}
