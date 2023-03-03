package org.datastructures;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args)  {

        try {
            // Creating a file
            File inputFile = new File("forgestormbreaker.txt");
            File inputFile1 = new File("forgestormbreaker1.txt");
            File inputFile2= new File("forgestormbreaker2.txt");
            File inputFile3= new File("forgestormbreaker3.txt");
            if (inputFile1.exists()) {

                //file reader to read the content bytes of the file
                FileReader fileReader = new FileReader(inputFile1);
                //Buffered reader to convert the bytes into strings
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                //reading the first line of the file
                int rows = Integer.parseInt(bufferedReader.readLine());
                int columns = Integer.parseInt(bufferedReader.readLine());

                // A queue obeys FIFO architecture - First in first out
                Queue<Integer> listEdges = new LinkedList<>();

                // getting the remaining contents of the file.
                Pattern pattern = Pattern.compile("\\s");
                Pattern pattern1 = Pattern.compile("\\s\\s");
                for (int i = 0; i < rows; i++) {
                    String[] firstRow = bufferedReader.readLine().split(" ");

                    for (int j = 0; j < firstRow.length; j++) {
                        listEdges.add(Integer.parseInt(firstRow[j]));

                    }

                }


                //creating a matrix using the files details
                int[][] matrix = new int[rows][columns];

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        // using the remove method to retrieve and remove vertices weight
                        matrix[i][j] = listEdges.remove();
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
                inputFile1.createNewFile();
                inputFile2.createNewFile();
                inputFile3.createNewFile();
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}