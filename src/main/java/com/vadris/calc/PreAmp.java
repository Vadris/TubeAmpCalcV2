package com.vadris.calc;

import com.vadris.math.Coordinate;
import com.vadris.math.Graph;
import com.vadris.tube.Tube;

/**
 * Implements calculations for tube preamps
 *
 * @author vadris
 */
public class PreAmp {

    public static Graph calcLoadLine(double rLoad, double uAnode){
        return null;
    }

    public static Coordinate calcOperatingPoint(Tube tube, Graph loadLine){
        return  null;
    }

    public static double calcEqAnodeResistance(){
        return 0;
    }

    public static double calcGain(Tube tube, Coordinate operatingPoint, double rLoad, double rBias, double rEqAnode){
        return 0;
    }
}
