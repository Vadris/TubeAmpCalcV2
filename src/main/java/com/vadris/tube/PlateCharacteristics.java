package com.vadris.tube;

import com.vadris.math.Graph;
import java.util.ArrayList;

class PlateCharacteristics {
    private ArrayList<Graph> plateCharacteristicsCurves = new ArrayList<>();

    public void addPlateCharacteristicsCurve(Graph plateCharacteristicsCurve, double uGrid){
        plateCharacteristicsCurve.setName(String.valueOf(uGrid));
        plateCharacteristicsCurves.add(plateCharacteristicsCurve);
    }

    public Graph getPlateCharacteristicCurve(double uGrid) throws Exception {
        for(int i = 0; i < plateCharacteristicsCurves.size() - 1; i++){
            if(plateCharacteristicsCurves.get(i).getName().equals(String.valueOf(uGrid))){
                return plateCharacteristicsCurves.get(i);
            }
        }
        throw new Exception("No Curve with that grid Voltage");
    }
}
