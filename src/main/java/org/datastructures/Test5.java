package org.datastructures;

import java.io.*;
import java.util.*;

public class Test5 {
    public static void main(String[] args)  {

        try {
            // Creating a file
            File inputFile = new File("forgestormbreaker.txt");
            if (inputFile.exists()) {

                //file reader to read the content bytes of the file
                FileReader fileReader = new FileReader(inputFile);
                //Buffered reader to convert the bytes into strings
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                //reading the first line of the file
                int rows = Integer.parseInt(bufferedReader.readLine());
                int columns = Integer.parseInt(bufferedReader.readLine());
                String firstRow;
                String edges = "";

                // A queue obeys FIFO architecture - First in first out
                Queue<Character> listEdges = new LinkedList<>();

                // getting the remaining contents of the file.
                for (int i = 0; i < rows; i++) {
                    firstRow = bufferedReader.readLine();
                    edges += firstRow;
                }
                String matrixEdges = edges.replaceAll(" ", "");

                for (int i = 0; i < matrixEdges.length(); i++) {
                    listEdges.add(matrixEdges.charAt(i));
                }
                //creating a matrix using the files details
                int[][] matrix = new int[rows][columns];

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        // using the remove method to retrieve and remove vertices weight
                        matrix[i][j] = Character.getNumericValue(listEdges.remove());
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println(matrix.length);
            }else{
                inputFile.createNewFile();
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}