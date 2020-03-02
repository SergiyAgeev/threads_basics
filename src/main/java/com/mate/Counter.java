package com.mate;

public class Counter {
    int iteration = 0;

    public Counter() {

    }

    public void incrementValue() {
        iteration++;
    }

    public int getIncrementedValue() {
        return iteration;
    }
}
