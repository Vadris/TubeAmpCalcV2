package com.vadris.math;

public class QuadraticFunction extends Function{
    private String name;
    private double a;
    private double b;
    private double c;

    public QuadraticFunction(double a, double b, double c){
        name = "f";
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public QuadraticFunction(String name, double a, double b, double c){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calc(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
    @Override
    public String toString() {
        return name + "(x)=" + a + "x^2+" + b + "+" + c;
    }
}
