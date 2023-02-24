package org.datastructures.models;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
    public String name;
    List<Neuron> neighbors = new ArrayList<>();

    public Neuron(String neuronName){
        this.name = neuronName;
    }

    public void addNeighbor(Neuron neuron){
        neighbors.add(neuron);
    }
}
