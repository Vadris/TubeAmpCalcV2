package com.vadris.math;
/**
 * Basic math functions
 *
 * @author Vadris
 */
public final class Basic {
    /**
     * Gets the nth Root of x
     *
     * @param n the root exponent
     * @param x the radical
     * @return the calculated value
     */
    public static double nthRootOf(double n, double x) throws Exception {
        if(n % 2 != 0 && x < 0){
            throw new Exception("Can not get even root of a negative number");
        }
        if(n < 0){
            throw new Exception("n must be larger than 0");
        }
        return Math.pow(x, (1/n));
    }

    /**
     * Check if value is within a specified range
     *
     * @param x the value to be tested
     * @param boundA the first bound (Can be upper or lower)
     * @param boundB the second bound (Can be upper or lower)
     * @return <code>true</code> if x is within the specified range
     */
    public static boolean isInRange(double x, double boundA, double boundB){
        if(boundB > boundA){
            return x < boundB && x > boundA;
        }
        return x < boundA && x > boundB;
    }
}
