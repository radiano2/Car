package com.company;

public class Car {

    Helm helm = new Helm(3);
    Wheel wheel = new Wheel(5);
    Body body = new Body(10);

    private String brand = "BMW";

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }
    

//    public void changeHelmSteering(int steering){
//        helm.setSteering(steering);
//
//    }

}
