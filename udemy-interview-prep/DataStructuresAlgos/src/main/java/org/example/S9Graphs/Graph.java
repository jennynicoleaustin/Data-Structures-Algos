package org.example.S9Graphs;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

// Key = String; value = arrayList of strings

//    Hash Maps cannot have duplicates
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

//    Add Vertex
    public boolean addVertex (String vertex) {
       if (adjList.get(vertex) == null) { // makes sure that the vertex value does not already exist within the graph (hashmap)
           adjList.put(vertex, new ArrayList<String>()); // each vertex is a key (vertex) and a value = array list of strings
           return true;
       }
        return false;
    }


// Method for testing in main
    public void printGraph() {
        System.out.println(adjList);
    }
}
