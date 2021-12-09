package com.vadris.tube;

import com.vadris.math.Coordinate;
import com.vadris.math.Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class TubeLoader {
    public static PlateCharacteristics loadPlateCharacteristics(String plateCharacteristicsFolder, ArrayList<Double> gridVoltages) throws IOException {
        PlateCharacteristics plateCharacteristics = new PlateCharacteristics();

        for(int i = 0; i <= gridVoltages.size() - 1; i++){
            try (BufferedReader br = new BufferedReader(new FileReader(plateCharacteristicsFolder + "\\Vg_" + gridVoltages.get(i) + "V.csv"))) {
                String line;
                Graph plateCharacteristicCurve = new Graph();
                while ((line = br.readLine()) != null) {
                    line = line.replace(',', '.');
                    String[] split = line.split(";");
                    plateCharacteristicCurve.addCoordinate(new Coordinate(Double.parseDouble(split[0]), Double.parseDouble(split[1])));
                }
                plateCharacteristics.addPlateCharacteristicsCurve(plateCharacteristicCurve, gridVoltages.get(i));
            }
        }
        return plateCharacteristics;
    }

}
