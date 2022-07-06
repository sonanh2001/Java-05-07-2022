package org.aibles.oop;

public class Dog extends Animal implements Run{

    private String loai;

    public Dog() {
        super();
    }



    public Dog(String name, String gender, String color) {
        super(name, gender, color);
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString()
 +                "loai='" + loai + '\'' +
                '}';
    }

    @Override
    void run() {
        System.out.println("cho chay");
    }

    @Override
    public void runI() {
        System.out.println("run I 1");
    }
}
