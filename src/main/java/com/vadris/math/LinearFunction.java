package com.vadris.math;

public class LinearFunction {
    private double m;
    private double b;
    private String name;

    public LinearFunction(String name, double m, double b){
        this.m = m;
        this.b = b;
        this.name = name;
    }
    public LinearFunction(double m, double b){
        this.m = m;
        this.b = b;
        this.name = "f";
    }

    @Override
    public String toString(){
        if(b > 0) {
            return name + "(x)=" + String.valueOf(m) + "x" + "+" + String.valueOf(b);
        }
        if(b == 0){
            return name + "(x)=" + String.valueOf(m) + "x";
        }
        return name + "(x)=" + String.valueOf(m) + "x" + "-" + String.valueOf(b * -1);
    }

    /** Getter Methods **/
    public double getM() {
        return m;
    }
    public double getB() {
        return b;
    }
    public String getName() {
        return name;
    }
    /** Setter Methods **/
    public void setM(double m) {
        this.m = m;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setName(String name) {
        this.name = name;
    }
}
