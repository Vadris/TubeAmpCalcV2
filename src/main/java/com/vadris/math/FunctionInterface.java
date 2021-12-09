package com.vadris.math;

/**
 * Interface for functions
 *
 * @author Vadris
 */
public interface FunctionInterface extends ToStringInterface {
     /**
      * Calculates the y value of a specified x value
      *
      * @param x the x value
      * @return the calculated y value
      */
     double calc(double x);
}
