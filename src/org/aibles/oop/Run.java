package org.aibles.oop;

public interface Run {
    void runI();

    default void run2() {
        System.out.println("i run 2");
    }
}
