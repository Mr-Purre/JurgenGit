package com.walking.lesson_10;

public class Lesson10_2 {
    public final String name;
    public int counter;

    public Lesson10_2(String name) {
        this(name, 0);
    }

    public Lesson10_2(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}