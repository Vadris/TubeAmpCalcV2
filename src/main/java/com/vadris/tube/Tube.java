package com.vadris.tube;

abstract class Tube {
    private String name;

    /**
     * Heater voltage in volts
     */
    private double uHeater;
    /**
     * Heater current in milliAmps
     */
    private double iHeater;
    /**
     * Number of pins
     */
    private int pins;

    /**
     * Maximum anode voltage in volt
     */
    private double uAnode;
    /**
     * Maximum anode dissipation in watts
     */
    private double pAnode;
    /**
     * Maximum cathode current in amps
     */
    private double iCathode;
    /**
     * Maximum grid voltage in volts
     */
    private double uGrid;
    /**
     * Maximum grid resistor
     */
    private double rGrid;

    private PlateCharacteristics plateCharacteristics;

    public Tube(String name, double uHeater, double iHeater, int pins, double uAnode, double pAnode, double iCathode, double uGrid, double rGrid, PlateCharacteristics plateCharacteristics){
        this.name = name;
        this.uHeater = uHeater;
        this.iHeater = iHeater;
        this.pins = pins;
        this.uAnode = uAnode;
        this.pAnode = pAnode;
        this.iCathode = iCathode;
        this.uGrid = uGrid;
        this.rGrid = rGrid;
        this.plateCharacteristics = plateCharacteristics;
    }

    public String getName() {
        return name;
    }
    public double get_uHeater() {
        return uHeater;
    }
    public double get_iHeater() {
        return iHeater;
    }
    public int get_Pins() {
        return pins;
    }
    public double get_uAnode() {
        return uAnode;
    }
    public double get_pAnode() {
        return pAnode;
    }
    public double get_iCathode() {
        return iCathode;
    }
    public double get_uGrid() {
        return uGrid;
    }
    public double get_rGrid() {
        return rGrid;
    }
    public PlateCharacteristics get_PlateCharacteristics() {
        return plateCharacteristics;
    }
}
