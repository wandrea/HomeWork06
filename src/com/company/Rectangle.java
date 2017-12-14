package com.company;

/**
 * Created by Andrea on 2017.12.14..
 */
public class Rectangle extends AbstractShape {
    private float a;
    private float b;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
