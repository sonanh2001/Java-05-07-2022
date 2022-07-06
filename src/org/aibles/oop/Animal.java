package org.aibles.oop;

public abstract class Animal {
    private String name;
    private String gender;
    private String color;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Animal(String name, String gender, String color) {
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    void run() {
        System.out.println("default run....");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
