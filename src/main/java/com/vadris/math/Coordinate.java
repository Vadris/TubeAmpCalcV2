package com.vadris.math;

public class Coordinate implements ToStringInterface{
    private double x;
    private double y;
    private String name;

    public Coordinate(String name,double x,double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public Coordinate(double x,double y){
        name  = "P";
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return name + "(" + x + "|" + y + ")";
    }

    /** Getter Methods **/
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public String getName() {
        return name;
    }
    /** Setter Methods **/
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setName(String name) {
        this.name = name;
    }
}
