package com.vadris.math;
/** Basic math functions **/
public final class Basic {
    /** Gets the nth Root of x **/
    public static double nthRootOF(double n, double x) throws Exception {
        if(n % 2 != 0 && x < 0){
            throw new Exception("Can not get even root of a negative number");
        }
        if(n < 0){
            throw new Exception("n must be larger than 0");
        }
        return Math.pow(x, (1/n));
    }

    /** returns true if x falls in between the boundaries **/
    public static boolean isInRange(double x, double boundA, double boundB){
        if(boundB > boundA){
            return x < boundB && x > boundA;
        }
        return x < boundA && x > boundB;
    }
}
