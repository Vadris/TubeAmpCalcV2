package com.vadris.math;

/**
 * Represents a coordinate
 *
 * @author Vadris
 */
public class Coordinate implements ToStringInterface{
    private double x;
    private double y;
    private String name;

    /**
     * Creates a coordinate with the specified name, x value, and y value
     *
     * @param name the name of the coordinate
     * @param x the x value of the coordinate
     * @param y the y value of the coordinate
     */
    public Coordinate(String name,double x,double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    /**
     * Creates a coordinate with the specified x value, and y value
     * Coordinate gets the name 'P'
     *
     * @param x the x value of the coordinate
     * @param y the y value of the coordinate
     */
    public Coordinate(double x,double y){
        name  = "P";
        this.x = x;
        this.y = y;
    }

    /**
     * Converts coordinate to a <code>String</code> with the scheme 'name'('x'|'y')
     *
     * @return the <code>String</code> representation of the coordinate
     */
    @Override
    public String toString(){
        return name + "(" + x + "|" + y + ")";
    }

    /**
     * Gets the x value of the coordinate
     *
     * @return the x value of the coordinate
     */
    public double getX(){
        return x;
    }
    /**
     * Gets the y value of the coordinate
     *
     * @return the y value of the coordinate
     */
    public double getY() {
        return y;
    }
    /**
     * Gets the name of the coordinate
     *
     * @return the name of the coordinate
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the x value of the coordinate
     *
     * @param x the x value of the coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the y value of the coordinate
     *
     * @param y the y value of the coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Sets the name of the coordinate
     *
     * @param name the name of the coordinate
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks if the Coordinate is within a square with specified corners
     *
     * @param test the coordinate to be tested
     * @param boundA the bottom left or upper right corner of the square
     * @param boundB the bottom left or upper right corner of the square
     * @return <code>true</code> if the Coordinate is within the square
     */
    public static boolean isInRange(Coordinate test, Coordinate boundA, Coordinate boundB) {
        return Basic.isInRange(test.getX(), boundA.getX(), boundB.getX()) && Basic.isInRange(test.getY(), boundA.getY(), boundB.getY());
    }
}
