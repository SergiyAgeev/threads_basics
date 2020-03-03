package com.mate;

public class Car implements Runnable {
    private Counter counter;
    private String name;
    private static int SIZE = 100;

    Car(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIncrementedValue() < SIZE) {
            counter.incrementValue();
            System.out.println("Car : " + name + " position = " + counter.getIncrementedValue());
        }
    }
}
