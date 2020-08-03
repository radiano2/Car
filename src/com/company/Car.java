package com.company;

public class Car {

    Helm helm = new Helm(8);
    Wheel wheel = new Wheel(5);
    Body body = new Body(10);

    private String brand = "BMW";

    int a = helm.method_helm();
    int b = wheel.method_wheel();
    int c = body.method_body();

    public void method_car(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
