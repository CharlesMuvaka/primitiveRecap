package org.datastructures.models;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
    public String name;
    public List<Neuron> neighbors = new ArrayList<>();

    public Neuron(String neuronName){
        this.name = neuronName;
    }

    public void addNeighbor(Neuron neuron){
        neighbors.add(neuron);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
