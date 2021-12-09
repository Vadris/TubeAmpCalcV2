package com.vadris.tube;

public abstract class Tube {
    private String name;
    private String usName;

    /**
     * Heater voltage in volts
     */
    private double uHeater;
    /**
     * Heater current in milliAmps
     */
    private double iHeater;

    /**
     * amplification factor of the Tube
     */
    private double amplification;
    /**
     * Maximum anode voltage in volt
     */
    private double uAnode;
    /**
     * Maximum anode dissipation in watts
     */
    private double pAnode;
    /**
     * Maximum grid voltage in volts
     */
    private double uGrid;
    /**
     * Maximum grid resistor
     */
    private double rGrid;

    private PlateCharacteristics plateCharacteristics;

    public Tube(String name, String usName, double uHeater, double iHeater, double amplification, double uAnode, double pAnode, double uGrid, double rGrid, PlateCharacteristics plateCharacteristics){
        this.name = name;
        this.usName = usName;
        this.uHeater = uHeater;
        this.iHeater = iHeater;
        this.amplification = amplification;
        this.uAnode = uAnode;
        this.pAnode = pAnode;
        this.uGrid = uGrid;
        this.rGrid = rGrid;
        this.plateCharacteristics = plateCharacteristics;
    }

    public String getName() {
        return name;
    }
    public String getUsName() {
        return usName;
    }
    public double getUHeater() {
        return uHeater;
    }
    public double getIHeater() {
        return iHeater;
    }
    public double getAmplification() {
        return amplification;
    }
    public double getUAnode() {
        return uAnode;
    }
    public double getPAnode() {
        return pAnode;
    }
    public double getUGrid() {
        return uGrid;
    }
    public double getRGrid() {
        return rGrid;
    }
    public PlateCharacteristics get_PlateCharacteristics() {
        return plateCharacteristics;
    }
}
