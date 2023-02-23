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
 * Given a starting event and an Adjacency Matrix representing a graph of all possible
 * events once Thanos arrives on Titan, determine the total possible number of timelines
 * that could occur AND the number of timelines with a total Expected Utility (EU) at
 * least the threshold value.
 *
 *
 * Steps to implement this class main method:
 *
 * Step 1:
 * timeStone file name is read using the file reader and a buffered reader
 * Read from timeStone file with the format:
 *    1. t (int): expected utility (EU) threshold
 *    2. v (int): number of events (vertices in the graph)
 *    3. v lines, each with 2 values: (int) event number and (int) EU value
 *    4. v lines, each with v (int) edges: 1 means there is a direct edge between two vertices, 0 no edge
 *
 * Note 1: the last v lines of the UseTimeStoneInputFile is an ajacency matrix for a directed
 * graph.
 * The rows represent the "from" vertex and the columns represent the "to" vertex.
 *
 * The matrix below has only two edges: (1) from vertex 1 to vertex 3 and, (2) from vertex 2 to vertex 0
 * 0 0 0 0
 * 0 0 0 1
 * 1 0 0 0
 * 0 0 0 0
 *
 * Step 2:
 * UseTimeStoneOutputFile name is passed through the command line as args[1]
 * Assume the starting event is vertex 0 (zero)
 * Compute all the possible timelines, output this number to the output file.
 * Compute all the posssible timelines with Expected Utility higher than the EU threshold,
 * output this number to the output file.
 *
 * Note 2: output these number the in above order, one per line.
 *
 * @author Charles Muvaka
 *
 */
public class TimeStone {

    public static void main(String[] args) {
        try{
            File timestone = new File("timestone.in");
            File timestone1 = new File("timestone1.in");
            File timestone2 = new File("timestone2.in");
            File timestone3 = new File("timestone3.in");

            if (timestone2.exists()){
                FileReader reader = new FileReader(timestone);
                BufferedReader bufferedReader = new BufferedReader(reader);

                //Reading the expected EU threshold of a vertex
                int expectedEU = Integer.parseInt(bufferedReader.readLine());

                //Reading the number of events in the graph
                int events = Integer.parseInt(bufferedReader.readLine());

                //Creating a map to store events with their expected EUs
                Map<Integer, Integer> eventsAndEu = new HashMap<>();
                AdjacencyMatrix matrix = new AdjacencyMatrix(events);

                //Reading event and its expected EU value.
                for (int i = 0; i < events; i++) {
                    String[] eventAndEu = bufferedReader.readLine().split(" ");
                    eventsAndEu.put(Integer.parseInt(eventAndEu[0]), Integer.parseInt(eventAndEu[1]));
                }
                //Creating a queue to store the graph edges
                Queue<Integer> graphEdges = new LinkedList<>();
                for (int i = 0; i < events; i++) {
                    String matrixEdges = bufferedReader.readLine();
                    for (int j = 0; j < matrixEdges.length(); j++) {
                        if (Character.isDigit(matrixEdges.charAt(j))){
                            graphEdges.add(Character.getNumericValue(matrixEdges.charAt(j)));
                        }
                    }
                }




            }else{
                timestone.createNewFile();
                timestone1.createNewFile();
                timestone2.createNewFile();
                timestone3.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
