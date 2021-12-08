package com.vadris.math;

public abstract class Function {
    private String name;

    public abstract double calc(double x);

    @Override
    public abstract String toString();
}
