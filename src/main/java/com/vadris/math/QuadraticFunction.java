package com.vadris.math;

import java.util.ArrayList;

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

    public ArrayList<Coordinate> calculateZeroCrossings() throws Exception {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0){
            return new ArrayList<>();
        }
        if (d == 0){
            ArrayList<Coordinate> zeroCrossings = new ArrayList<>();

            double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double y = calc(x);
            zeroCrossings.add(new Coordinate(x, y));

            return zeroCrossings;
        }
        if(d > 0){
            ArrayList<Coordinate> zeroCrossings = new ArrayList<>();

            double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double y = calc(x);
            zeroCrossings.add(new Coordinate(x, y));
            x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            y = calc(x);
            zeroCrossings.add(new Coordinate(x, y));

            return zeroCrossings;
        }
        return null; /** Should never have to return null **/
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
