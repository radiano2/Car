package com.company;

public class Wheel {
    public Wheel(int size) {
        this.size = size;
    }

    private int size = 5;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void method_wheel() {
        System.out.println(size*5);
    }
}
