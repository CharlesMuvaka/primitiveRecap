package org.datastructures;

public class AdjacencyMatrix {
    private int vertices;
    private int[][] matrix;
    public AdjacencyMatrix(int vertices){
        this.vertices = vertices;
        this.matrix = new int[vertices][vertices];
    }

    public void addNeighbor(int i, int j){
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }
}