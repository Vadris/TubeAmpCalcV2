package com.vadris.math;
/** Basic math functions **/
public final class Basic {
    /** Gets the nth Root of x **/
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
     * Returns true if x falls in between the boundaries
     * @param x value to be tested
     * @param boundA First bound
     * @param boundB Second bound
     * @return <code>true</code> if x falls in between the boundaries
     */
    public static boolean isInRange(double x, double boundA, double boundB){
        if(boundB > boundA){
            return x < boundB && x > boundA;
        }
        return x < boundA && x > boundB;
    }
}
