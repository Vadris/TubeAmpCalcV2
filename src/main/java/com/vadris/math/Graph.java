package com.vadris.math;

import java.util.ArrayList;

public class Graph {
    private String name;
    private ArrayList<Coordinate> coordinates;

    public Graph(){
        name = "Graph";
        coordinates = new ArrayList<>();
    }
    public Graph(String name){
        this.name = name;
        coordinates = new ArrayList<>();
    }
    public Graph(ArrayList<Coordinate> coordinates){
        name = "Graph";
        this.coordinates = coordinates;
    }
    public Graph(String name, ArrayList<Coordinate> coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }

    public void addCoordinate(Coordinate coordinate){
        coordinates.add(coordinate);
    }
    public void addCoordinate(int index, Coordinate coordinate){
        coordinates.add(index, coordinate);
    }

    public void removeCoordinate(int index){
        coordinates.remove(index);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "name='" + name + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }

    /** Getter Methods **/
    public String getName() {
        return name;
    }
    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }
    public Coordinate getCoordinate(int index){
        return coordinates.get(index);
    }
    /** Setter Methods **/
    public void setName(String name) {
        this.name = name;
    }
}
