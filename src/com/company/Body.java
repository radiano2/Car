package com.company;

public class Body {
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public Body(int dimensions) {
        this.dimensions = dimensions;
    }

    private int dimensions = 10;

    public int getDimensions() {
        return dimensions;
    }


    public void method_body(){
        System.out.println(dimensions * 10);
    }
}
