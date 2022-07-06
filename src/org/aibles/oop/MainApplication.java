package org.aibles.oop;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Demo oop");

        People people = new People();
        people.setName("Do");

        Dog a = new Dog("Cho", "cai", "Mau do");
        a.setLoai("loai 1");
        System.out.println(a);
        a.run();
        a.run2();
        a.runI();


        Animal b = new Cat();
    }
}
