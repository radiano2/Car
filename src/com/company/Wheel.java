package com.company;

public class Wheel {
    public Wheel(int size) {
        this.size = size;
    }

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int method_wheel() {
        return size *5;
    }
}
