package com.mvan.estruturas.listaDuplamenteEncadeada;

public class Node2P {
    public String data;
    public Node2P prevPointer;
    public Node2P nextPointer;

    public Node2P(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node2P getPrevPointer() {
        return prevPointer;
    }

    public void setPrevPointer(Node2P prevPointer) {
        this.prevPointer = prevPointer;
    }

    public Node2P getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node2P nextPointer) {
        this.nextPointer = nextPointer;
    }

    @Override
    public String toString() {
        return "Node2P [data=" + data + "]";
    }

    

    
}
