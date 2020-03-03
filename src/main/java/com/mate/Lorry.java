package com.mate;

public class Lorry extends Thread {
    private String name;
    private Counter counter;
    private static int SIZE = 100;

    public Lorry(String name, Counter counter) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        while (counter.getIncrementedValue() < SIZE) {
            counter.incrementValue();
            System.out.println("Lorry: " + name + " position = " + counter.getIncrementedValue());
        }
    }
}
