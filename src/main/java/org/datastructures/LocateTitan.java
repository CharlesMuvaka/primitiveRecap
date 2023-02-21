package org.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * Using the Adjacency Matrix of n vertices and starting from Earth (vertex 0),
 * modify the edge weights using the functionality values of the vertices that each edge
 * connects, and then determine the minimum cost to reach Titan (vertex n-1) from Earth (vertex 0).
 *
 * Steps to implement this class main method:
 *
 * Step 1:
 * LocateTitanInputFile name is passed through the command line as args[0]
 * Read from LocateTitanInputFile with the format:
 *    1. g (int): number of generators (vertices in the graph)
 *    2. g lines, each with 2 values, (int) generator number, (double) funcionality value
 *    3. g lines, each with g (int) edge values, referring to the energy cost to travel from
 *       one generator to another
 * Create an adjacency matrix for g generators.
 *
 * Populate the adjacency matrix with edge values (the energy cost to travel from one
 * generator to another).
 *
 * Step 2:
 * Update the adjacency matrix to change EVERY edge weight (energy cost) by DIVIDING it
 * by the functionality of BOTH vertices (generators) that the edge points to. Then,
 * typecast this number to an integer (this is done to avoid precision errors). The result
 * is an adjacency matrix representing the TOTAL COSTS to travel from one generator to another.
 *
 * Step 3:
 * LocateTitanOutputFile name is passed through the command line as args[1]
 * Use Dijkstra’s Algorithm to find the path of minimum cost between Earth and Titan.
 * Output this number into your output file!
 *
 * Note: use the StdIn/StdOut libraries to read/write from/to file.
 *
 *   To read from a file use StdIn:
 *     StdIn.setFile(inputfilename);
 *     StdIn.readInt();
 *     StdIn.readDouble();
 *
 *   To write to a file use StdOut (here, minCost represents the minimum cost to
 *   travel from Earth to Titan):
 *     StdOut.setFile(outputfilename);
 *     StdOut.print(minCost);
 *
 * @author Charles Muvaka
 */

public class LocateTitan {
    public static void main(String[] args) {
        try{
            File locateTitan = new File("locatetitan.in");

           // test files to test the integrity of the code.
            File locateTitan1 = new File("locatetitan1.in");
            File locateTitan2 = new File("locatetitan2.in");
            File locateTitan3 = new File("locatetitan3.in");
            if (locateTitan1.exists()){
                // creating a file reader to read the bytes of the file
                FileReader reader = new FileReader(locateTitan1);
                // using a buffered reader to get the actual content
                BufferedReader bufferedReader = new BufferedReader(reader);

                //getting the number of vertices
                int vertices = Integer.parseInt(bufferedReader.readLine());

                //defining a map to store the cost of each vertex
                Map<Integer, Double> costMap = new HashMap<>();

                for (int i = 0; i < vertices; i++) {
                    String[] vertexAndCost = bufferedReader.readLine().split(" ");
                    costMap.put(Integer.parseInt(vertexAndCost[0]), Double.parseDouble(vertexAndCost[1]));
                }
                // initialising a queue to store the vertices travel cost
                Queue<Integer> travelCost = new LinkedList<>();
                for (int i = 0; i < vertices; i++) {
                    String vertexWeight[] = bufferedReader.readLine().split("\\s");
                    for (int j = 0; j < vertexWeight.length; j++) {
                        travelCost.add(Integer.parseInt(vertexWeight[j]));
                    }
                }
                // initializing a matrix to store the data
                AdjacencyMatrix graph = new AdjacencyMatrix(vertices);
                for (int i = 0; i < vertices; i++) {
                    for (int j = 0; j < vertices; j++) {
                        graph.addWeight(i, j, travelCost.remove());
                        System.out.print(graph.matrix[i][j] + " ");
                    }
                    System.out.println(" ");

                }

            }else{
                locateTitan.createNewFile();
                locateTitan1.createNewFile();
                locateTitan2.createNewFile();
                locateTitan3.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
