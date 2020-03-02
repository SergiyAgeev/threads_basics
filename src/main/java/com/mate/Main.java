package com.mate;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread car = new Thread(new Car("BMW", counter));
        Thread lorry = new Lorry("AUDI", counter);
        car.start();
        lorry.start();
    }
}
