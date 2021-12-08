package com.vadris.math;

import java.util.ArrayList;

public class Graph implements ToStringInterface{
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

    public static Coordinate findIntersection(Graph graphA, Graph graphB) throws Exception {
        for (int i = 0; i <= graphA.getCoordinates().size() - 2; i++){
            LinearFunction function1 = new LinearFunction(graphA.getCoordinates().get(i), graphA.getCoordinates().get(i + 1));

            for (int j = 0; j <= graphB.getCoordinates().size() - 2; j++){
                LinearFunction function2 = new LinearFunction(graphB.getCoordinates().get(j), graphB.getCoordinates().get(j + 1));

                try{
                    Coordinate coord = LinearFunction.findIntersection(function1, function2);
                    if (Coordinate.isInRange(coord, graphA.getCoordinates().get(i), graphA.getCoordinates().get(i + 1)) && Coordinate.isInRange(coord, graphB.coordinates.get(j), graphB.coordinates.get(j + 1)))
                    {
                        return coord;
                    }
                }
                catch(Exception e){
                }
            }
        }
        throw new Exception("Graphs do not intersect");
    }
}

