package com.vadris.tube;

import com.vadris.math.Coordinate;
import com.vadris.math.Graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

    public static Tube loadTube(String tubeFolder) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object one = parser.parse(new FileReader(tubeFolder + "\\info.json"));
        JSONObject two = (JSONObject) one;
        JSONArray arr = (JSONArray) two.get("tube");
        for(Object obj : arr){
            JSONObject jsonObj = (JSONObject) obj;
            String name = (String) jsonObj.get("name");
            String usName = (String) jsonObj.get("usName");
            double uHeater = (Double) jsonObj.get("heaterVoltage");
            double iHeater = (Double) jsonObj.get("heaterCurrent");
            double amplification = (Double) jsonObj.get("amplification");
            double internalResistance = (Double) jsonObj.get("internalResistance");
            double uAnode = (Double) jsonObj.get("anodeVoltageMax");
            double pAnode = (Double) jsonObj.get("anodeDissipationMax");
            double uGrid = (Double) jsonObj.get("gridVoltageMax");
            double rGrid = (Double) jsonObj.get("gridResistorMax");
            double cathodeToHeaterVoltageMax = (Double) jsonObj.get("cathodeToHeaterVoltageMax");
            double cathodeToHeaterResistanceMax = (Double) jsonObj.get("cathodeToHeaterResistanceMax");
            JSONArray arrCharacteristics = (JSONArray) jsonObj.get("PlateCharacteristics");
            ArrayList<Double> gridVoltages = new ArrayList<>();
            for(Object objtwo : arrCharacteristics){
                gridVoltages.add((Double) objtwo);
            }
            PlateCharacteristics plateCharacteristics = loadPlateCharacteristics(tubeFolder + "\\PlateCharacteristics", gridVoltages);
            switch ((String) jsonObj.get("type")){
                case "diode":
                    return null;
                case "triode":
                    return new Triode(name, usName, uHeater, iHeater, amplification, uAnode, pAnode, uGrid, rGrid, plateCharacteristics);
                case "doubleTriode":
                    return new DoubleTriode(name, usName, uHeater, iHeater, amplification, uAnode, pAnode, uGrid, rGrid, plateCharacteristics);
                case "tetrode":
                    return null;
                case "pentode":
                    return null;
            }

        }
    return null;
    }
}
