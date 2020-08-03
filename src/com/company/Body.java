package com.company;

public class Body {
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public Body(int dimensions) {
        this.dimensions = dimensions;
    }

    private int dimensions;

    public int getDimensions() {
        return dimensions;
    }


    public int method_body(){
        return dimensions*10;
    }
}
