package com.vadris.math;

/**
 * Represents a linear function / y=mx+b
 *
 * @author Vadris
 */
public class LinearFunction implements FunctionInterface{
    private double m;
    private double b;
    private String name;

    /**
     * Creates a linear function with the specified name, m value, and b value
     *
     * @param name the name of the function
     * @param m the slope of the function
     * @param b the axis intercept of the function
     */
    public LinearFunction(String name, double m, double b){
        this.m = m;
        this.b = b;
        this.name = name;
    }
    /**
     * Creates a linear function with the specified m value, and b value
     * Function gets the name 'f'
     *
     * @param m the slope of the function
     * @param b the axis intercept of the function
     */
    public LinearFunction(double m, double b){
        this.m = m;
        this.b = b;
        name = "f";
    }
    /**
     * Creates a linear function with the specified name, by calculating m and b using 2 points
     *
     * @param name the name of the function
     * @param pointA the first point
     * @param pointB the second point
     * @throws Exception if points have the same x value
     */
    public LinearFunction(String name, Coordinate pointA, Coordinate pointB) throws Exception{
        if(pointA.getX() == pointB.getX()){
            throw new Exception("Points must have different x Coordinates");
        }
        if(pointA.getX() > pointB.getX()){
            m = (pointA.getY() - pointB.getY()) / (pointA.getX() - pointB.getX());
            b = pointA.getY() - m * pointA.getX();
        }
        if(pointA.getX() < pointB.getX()){
            m = (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
            b = pointA.getY() - m * pointA.getX();
        }
        this.name  = name;
    }
    /**
     * Creates a linear function with the specified name, by calculating m and b using 2 points
     * Function gets the name 'f'
     *
     * @param pointA the first point
     * @param pointB the second point
     * @throws Exception if points have the same x value
     */
    public LinearFunction(Coordinate pointA, Coordinate pointB) throws Exception{
        if(pointA.getX() == pointB.getX()){
            throw new Exception("Points must have different x Coordinates");
        }
        if(pointA.getX() > pointB.getX()){
            m = (pointA.getY() - pointB.getY()) / (pointA.getX() - pointB.getX());
            b = pointA.getY() - m * pointA.getX();
        }
        if(pointA.getX() < pointB.getX()){
            m = (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
            b = pointA.getY() - m * pointA.getX();
        }
        name = "f";
    }

    /**
     * Calculates the y value for a specified x value
     *
     * @param x the x value
     * @return the y value
     */
    @Override
    public double calc(double x) {
        return m * x + b;
    }

    /**
     * Converts the function to a <code>String</code>
     *
     * @return the function as a <code>String</code>
     */
    @Override
    public String toString(){
        if(b > 0) {
            return name + "(x)=" + m + "x" + "+" + b;
        }
        if(b == 0){
            return name + "(x)=" + m + "x";
        }
        return name + "(x)=" + m + "x" + "-" + b * -1;
    }

    /**
     * Gets the m value of the function
     *
     * @return the m value
     */
    public double getM() {
        return m;
    }
    /**
     * Gets the b value of the function
     *
     * @return the b value
     */
    public double getB() {
        return b;
    }
    /**
     * Gets the name of the function
     *
     * @return the name of the function
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the m value of the function
     *
     * @param m the m value
     */
    public void setM(double m) {
        this.m = m;
    }
    /**
     * Sets the b value of the function
     *
     * @param b the b value
     */
    public void setB(double b) {
        this.b = b;
    }
    /**
     * Sets the name of the function
     *
     * @param name the name of the function
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Finds the coordinate, at which the two specified functions cross
     *
     * @param functionA the first function
     * @param functionB the second function
     * @return the point of intersection
     * @throws Exception if functions don't intersect
     */
    public static Coordinate findIntersection(LinearFunction functionA, LinearFunction functionB) throws Exception {
        try {
            double xs = (functionB.b - functionA.b) / (functionA.m - functionB.m);
            double ys = functionA.calc(xs);

            return new Coordinate(xs, ys);
        }
        catch(Exception e) {
            throw new Exception("Functions do not intersect");
        }
    }
}
