package org.datastructures;

/*
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


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UseTimeStone {
    public static void main(String[] args) {
        try{

            //creating a file to read data from
            File inputFile = new File("usetimestone.in");
            File inputFile1 = new File("usetimestone1.in");
            File inputFile2 = new File("usetimestone2.in");
            File inputFile3 = new File("usetimestone3.in");

            if (inputFile.exists()){
                //initialising a file reader to read the byte contents of the file
                FileReader reader = new FileReader(inputFile);

                //initialising a buffered reader to read the actual content of the file.
                BufferedReader bufferedReader = new BufferedReader(reader);

                //reading the expected utility (EU) threshold from the file.
                int expectedEu = Integer.parseInt(bufferedReader.readLine());

                //reading the number of events (vertices in the graph)
                int events = Integer.parseInt(bufferedReader.readLine());

                //initialising a map to store an event and its expected eu value
                Map<Integer, Integer > eventsAndEu = new HashMap<>();

                //reading the (int) event number and (int) EU value
                for (int i = 0; i < events; i++) {
                    //creating a string array of the event and its eu
                    String[] eventAndEu = bufferedReader.readLine().split(" ");
                    //storing the event and its expected eu in a map
                    eventsAndEu.put(Integer.parseInt(eventAndEu[0]),Integer.parseInt(eventAndEu[1]));
                }
                //initialising a graph instance to store its data
                AdjacencyMatrix graph = new AdjacencyMatrix(events);

                //reading the graph edges from the file
                for (int i = 0; i < events; i++) {
                    String[] edges = bufferedReader.readLine().split(" ");
                    for (int j = 0; j < edges.length; j++) {
                        graph.matrix[i][j] =Integer.parseInt(edges[j]);
                    }
                }
                //initialising a variable to store the total number of timelines
                int noOfTimelines = 0;

                //initialising a stack to perform the depth first traversal
                Stack<Integer> visitedEvents = new Stack<>();
                visitedEvents.add(0);
                noOfTimelines += visitedEvents.size();

                //initialising a map to store a timeline and its events
                Map<Integer, List<Integer>> timelineAndEvents = new HashMap<>();

                //initialising a list to store the timelines
                List<Integer> timelinesEvents = new ArrayList<>();

                for (int i = 0; i < events; i++) {
                    while (visitedEvents.size() != 0){
                        int currentVertex = visitedEvents.pop();
                        timelinesEvents.add(currentVertex);
                        List<Integer> test = new ArrayList<>();
                        for (int j = 0; j < timelinesEvents.size(); j++) {
                            test.add(timelinesEvents.get(j));
                        }
                        timelineAndEvents.put(i, test);


                        for (int j = 0; j < graph.matrix[currentVertex].length; j++) {
                            if (graph.matrix[currentVertex][j] == 1){
                                visitedEvents.push(j);

                                noOfTimelines++;
                            }
                        }
                    }
                }

                for (int i = 0; i < timelineAndEvents.size(); i++) {
//                    System.out.println(timelinesEvents.size());
                    System.out.println(timelineAndEvents.get(i));

                }

                System.out.println(timelineAndEvents.size());


            }else{
                inputFile.createNewFile();
                inputFile2.createNewFile();
                inputFile1.createNewFile();
                inputFile3.createNewFile();
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
