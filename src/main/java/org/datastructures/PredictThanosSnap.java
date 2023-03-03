package org.datastructures;

import java.io.*;

/**
 * Given an adjacency matrix, use a random() function to remove half of the nodes.
 * Then, write into the output file a boolean (true or false) indicating if
 * the graph is still connected.
 *
 * Steps to implement this class main method:
 *
 * Step 1:
 * PredictThanosSnapInputFile name is read using an file reader and a buffered reader
 * Read from PredictThanosSnapInputFile with the format:
 *    1. seed (long): a seed for the random number generator
 *    2. p (int): number of people (vertices in the graph)
 *    2. p lines, each with p edges: 1 means there is a direct edge between two vertices, 0 no edge
 *
 * Note: the last p lines of the PredictThanosSnapInputFile is an ajacency matrix for
 * an undirected graph.
 *
 * The matrix below has two edges 0-1, 0-2 (each edge appear twice in the matrix, 0-1, 1-0, 0-2, 2-0).
 *
 * 0 1 1 0
 * 1 0 0 0
 * 1 0 0 0
 * 0 0 0 0
 *
 * Step 2:
 * Delete random vertices from the graph. You can use the following pseudocode.
 * StdRandom.setSeed(seed);
 * for (all vertices, go from vertex 0 to the final vertex) {
 *     if (StdRandom.uniform() <= 0.5) {
 *          delete vertex;
 *     }
 * }
 * Answer the following question: is the graph (after deleting random vertices) connected?
 * Output true (connected graph), false (unconnected graph) to the output file.
 *
 * Note 1: a connected graph is a graph where there is a path between EVERY vertex on the graph.
 *
 * @author Charles Muvaka
 */

public class PredictThanosSnap {
    public static void main(String[] args) {
        try{
            File inputFile = new File("predictthanossnap.in");
            File inputFile1 = new File("predictthanossnap1.in");
            File inputFile2 = new File("predictthanossnap2.in");
            File inputFile3 = new File("predictthanossnap3.in");

            if (inputFile.exists()){
                FileReader reader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(reader);

                //Reading the seed from the input file
                int seed = Integer.parseInt(bufferedReader.readLine());

                //Reading the number of vertices from the graph
                int vertices = Integer.parseInt(bufferedReader.readLine());
            }else{
                inputFile.createNewFile();
                inputFile1.createNewFile();
                inputFile2.createNewFile();
                inputFile3.createNewFile();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
