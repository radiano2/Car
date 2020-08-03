package com.company;

public class Helm {
    public Helm(int steering) {
        this.steering = steering;
    }

    private int steering;

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public void method_helm(){
        System.out.println(steering*3);
    }
}
