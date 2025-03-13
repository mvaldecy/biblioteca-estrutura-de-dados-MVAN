package com.mvan.estruturas.listaEncadeada;

public class Node {
    private String data;
    private Node pointer;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getPointer() {
        return this.pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", pointer=" + pointer + "]";
    }

    
}
