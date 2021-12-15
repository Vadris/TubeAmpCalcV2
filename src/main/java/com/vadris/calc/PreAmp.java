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
        Coordinate coordinateA = new Coordinate(0, uAnode);

        double x  = uAnode / (rLoad / 1000);
        Coordinate coordinateB = new Coordinate(x, 0);

        Graph loadLine = new Graph();

        loadLine.addCoordinate(coordinateA);
        loadLine.addCoordinate(coordinateB);

        return loadLine;
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
