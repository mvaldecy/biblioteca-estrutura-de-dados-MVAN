package com.mvan.estruturas.FilaPrioritaria;

public class NodeQueue {
    private NodeQueue nextPointer;
    private String data;
    private int priority;

    public NodeQueue() {}

    public NodeQueue(String data) {
        this.data = data;
    }

    public NodeQueue(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public NodeQueue getNextPointer() {
        return this.nextPointer;
    }

    public void setNextPointer(NodeQueue nextPointer) {
        this.nextPointer = nextPointer;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    
}
