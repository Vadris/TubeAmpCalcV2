package com.vadris.math;

import java.util.ArrayList;

/**
 * Represents a graph using a list of coordinates
 *
 * @author Vadris
 */
public class Graph implements ToStringInterface{
    private String name;
    private ArrayList<Coordinate> coordinates;

    /**
     * Creates a new graph
     */
    public Graph(){
        name = "Graph";
        coordinates = new ArrayList<>();
    }
    /**
     * Creates a Graph with a specified name
     *
     * @param name the name
     */
    public Graph(String name){
        this.name = name;
        coordinates = new ArrayList<>();
    }
    /**
     * Creates a graph from a list of coordinates
     *
     * @param coordinates the list of coordinates
     */
    public Graph(ArrayList<Coordinate> coordinates){
        name = "Graph";
        this.coordinates = coordinates;
    }
    /**
     * Crates a graph with a specified name from a list of coordinates
     *
     * @param name the name of the graph
     * @param coordinates the list of coordinates
     */
    public Graph(String name, ArrayList<Coordinate> coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }

    /**
     * Adds a coordinate to the end of graph
     *
     * @param coordinate the coordinate
     */
    public void addCoordinate(Coordinate coordinate){
        coordinates.add(coordinate);
    }
    /**
     * Adds a coordinate at a specified index
     *
     * @param index the index at which the coordinate should be added
     * @param coordinate the coordinate
     */
    public void addCoordinate(int index, Coordinate coordinate){
        coordinates.add(index, coordinate);
    }

    /**
     * Removes the coordinate at the specified index
     *
     * @param index the index of the coordinate that should be removed
     */
    public void removeCoordinate(int index){
        coordinates.remove(index);
    }

    /**
     * Coverts the graph to <code>String</code>
     *
     * @return the graph as a <code>String</code>
     */
    @Override
    public String toString() {
        return name + "=" + coordinates;
    }

    /**
     * Gets the name of the graph
     *
     * @return the name of the graph
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the list of coordinates
     *
     * @return the list of coordinates
     */
    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }
    /**
     * Gets the coordinate at a specified index
     *
     * @param index the index
     * @return the coordinate at the specified index
     */
    public Coordinate getCoordinate(int index){
        return coordinates.get(index);
    }

    /**
     * Sets the name of the graph
     *
     * @param name the name of the graph
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Finds the coordinate where two graphs intersect.
     * the points are connected with straight lines
     *
     * @param graphA the first graph
     * @param graphB the second graph
     * @return the coordinate at which the graphs intersect
     * @throws Exception if the graphs don't intersect
     */
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

