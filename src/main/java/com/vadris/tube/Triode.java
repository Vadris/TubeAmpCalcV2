package com.vadris.tube;

public class Triode extends Tube{
    public Triode(String name, String usName, double uHeater, double iHeater, double amplification, double uAnode, double pAnode, double uGrid, double rGrid, PlateCharacteristics plateCharacteristics) {
        super(name, usName, uHeater, iHeater, amplification, uAnode, pAnode, uGrid, rGrid, plateCharacteristics);
    }
}
