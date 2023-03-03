package org.datastructures.models;

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

    public int shortestPath(int startNode, int endNode){
        int cost = 0;
        boolean[] visited;
        return cost;
    }
}