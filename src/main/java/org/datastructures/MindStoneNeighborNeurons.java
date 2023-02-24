package org.datastructures;


import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Given a Set of Edges representing Vision's Neural Network, identify all of the
 * vertices that connect to the Mind Stone.
 * List the names of these neurons in the output file.
 *
 *
 * Steps to implement this class main method:
 *
 * Step 1:
 * MindStoneNeighborNeuronsInputFile name is read using a file reader and a buffered reader
 * Read from the MindStoneNeighborNeuronsInputFile with the format:
 *    1. v (int): number of neurons (vertices in the graph)
 *    2. v lines, each with a String referring to a neuron's name (vertex name)
 *    3. e (int): number of synapses (edges in the graph)
 *    4. e lines, each line refers to an edge, each line has 2 (two) Strings: from to
 *
 * Step 2:
 * Identify the vertices that connect to the Mind Stone vertex.
 * Output these vertices, one per line.
 *
 * Note 1: The Mind Stone vertex has out degree 0 (zero), meaning that there are
 * no edges leaving the vertex.
 *
 * Note 2: If a vertex v connects to the Mind Stone vertex m then the graph has
 * an edge v -> m
 *
 * @author Charles Muvaka
 *
 */


public class MindStoneNeighborNeurons {

    public static void main(String[] args) {
        try{
            File inputFile = new File("mindstoneneighborneurons.in");
            File inputFile1 = new File("mindstoneneighborneurons1.in");
            File inputFile2 = new File("mindstoneneighborneurons2.in");
            File inputFile3 = new File("mindstoneneighborneurons3.in");

            if (inputFile.exists()){
                FileReader reader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(reader);

                //reading the number of neurons from the input file
                int neurons = Integer.parseInt(bufferedReader.readLine());

            }else{
                inputFile.createNewFile();
                inputFile1.createNewFile();
                inputFile2.createNewFile();
                inputFile3.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
