package com.company;

public class Car {

    Helm helm = new Helm(8);
    Wheel wheel = new Wheel(5);
    Body body = new Body(10);

    private String brand = "BMW";

    public void method_car(){
        System.out.println(helm.method_helm());
        System.out.println(wheel.method_wheel());
        System.out.println(body.method_body());
    }


}
