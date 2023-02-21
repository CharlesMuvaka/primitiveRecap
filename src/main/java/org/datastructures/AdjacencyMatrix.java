package org.datastructures;

public class AdjacencyMatrix {
    private int vertices;
    public int[][] matrix;
    public AdjacencyMatrix(int vertices){
        this.vertices = vertices;
        this.matrix = new int[vertices][vertices];
    }

    public void addWeight(int i, int j, int k ){
        matrix[i][j] = k;
    }
}