package ru.dzhafarov.java.core;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}
