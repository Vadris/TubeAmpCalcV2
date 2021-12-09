package com.vadris.tube;

public class Triode extends Tube{
    public Triode(String name, double uHeater, double iHeater, int pins, double uAnode, double pAnode, double iCathode, double uGrid, double rGrid, PlateCharacteristics plateCharacteristics) {
        super(name, uHeater, iHeater, pins, uAnode, pAnode, iCathode, uGrid, rGrid, plateCharacteristics);
    }
}
