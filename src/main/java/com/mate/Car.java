package com.mate;

public class Car implements Runnable {
    private Counter counter;
    private String name;

    Car(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIncrementedValue() < 100) {
            counter.incrementValue();
            System.out.println("Car : " + name + " position = " + counter.getIncrementedValue());
        }
    }
}
