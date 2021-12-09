package com.vadris;

import com.vadris.tube.Triode;
import com.vadris.tube.Tube;
import com.vadris.tube.TubeLoader;

/**
 * Temp Main class for testing
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Tube tube = TubeLoader.loadTube("D:\\Github\\TubeAmpCalcV2\\data\\Tubes\\ECC83");
        System.out.println(tube.getAmplification());
        System.out.println(tube.get_PlateCharacteristics().getPlateCharacteristicCurve(-4.0));
    }
}
