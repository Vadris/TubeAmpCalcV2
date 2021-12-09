package com.vadris.math;

import java.util.ArrayList;

/**
 * Represents a quadratic function / y=ax²+bx+c
 *
 * @author Vadris
 */
public class QuadraticFunction implements FunctionInterface{
    private String name;
    private double a;
    private double b;
    private double c;

    /**
     * Creates a quadratic function with specified values for a, b, c
     * function gets name 'f'
     *
     * @param a a value
     * @param b b value
     * @param c c value
     */
    public QuadraticFunction(double a, double b, double c){
        name = "f";
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Creates a quadratic function with specified name and values for a, b, c
     *
     * @param name name of the function
     * @param a a value
     * @param b b value
     * @param c c value
     */
    public QuadraticFunction(String name, double a, double b, double c){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Calculates the zero crossings of the function
     *
     * @return List with zero crossings
     */
    public ArrayList<Coordinate> calculateZeroCrossings(){
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
        return null; /* Should never have to return null **/
    }

    /**
     * Calculates the y value for a specified x value
     *
     * @param x the x value
     * @return the y value
     */
    @Override
    public double calc(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
    /**
     * Converts the function to a <code>String</code>
     *
     * @return the function as a <code>String</code>
     */
    @Override
    public String toString() {
        return name + "(x)=" + a + "x^2+" + b + "+" + c;
    }
}
