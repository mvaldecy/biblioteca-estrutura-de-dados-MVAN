package com.mvan.estruturas.FilaPrioritaria;

public class NodePriority {
    private int priority;
    private NodePriority prevPointer;
    private NodePriority nextPointer;
    private Queue Queue;

    public NodePriority() {}

    public NodePriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public NodePriority getPrevPointer() {
        return prevPointer;
    }

    public void setPrevPointer(NodePriority prevPointer) {
        this.prevPointer = prevPointer;
    }

    public NodePriority getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(NodePriority nextPointer) {
        this.nextPointer = nextPointer;
    }

    public Queue getQueue() {
        return Queue;
    }

    public void setQueue(Queue queue) {
        Queue = queue;
    }

    

    

}
