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

    public boolean addEdge (String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1) // will return the value at vertex1 (the array list)
                    .add(vertex2); // adds value of vertex2 to the array list for vertex1
            adjList.get(vertex2) // repeat process for the other vertex
                    .add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge (String vertex1, String vertex2) { // pass the two vertices that you are removing the edge between
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1)
                    .remove(vertex2);
            adjList.get(vertex2)
                    .remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex (String removeVertex) {
//        Must remove the vertex indicated and the edges for the vertex AND the edge of (vertex) from the vertices of the edges of vertex
       if ( adjList.get(removeVertex) == null) return false; // the vertex does not exist in the graph
        for (String otherVertex : adjList.get(removeVertex)) { // for each of the vertexes within the arraylist attached to vertex we want to remove
            adjList.get(otherVertex) // get the otherVertex that is within the removeVertex array list
                    .remove(removeVertex); // remove the removeVertex from otherVertex's array list
        }
        adjList.remove(removeVertex);
        return true;
    }


// Method for testing in main
    public void printGraph() {
        System.out.println(adjList);
    }
}
