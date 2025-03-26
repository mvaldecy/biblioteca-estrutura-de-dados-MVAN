package com.mvan.estruturas.fila;

public class Queue {
    int size;
    NodeQueue head;

    public Queue() {
        this.size = 0;
        this.head = new NodeQueue();
    }

    private void addEmpty(NodeQueue node) {
        this.head.setNextPointer(node);
    }

    public NodeQueue getTail() {
        NodeQueue nq = this.head;
        while(nq.getNextPointer() != null) {
            nq = nq.getNextPointer();
        }
        return nq;
    }

    public void enqueue(NodeQueue node) {
        if (this.size == 0) {
            addEmpty(node);
        } else {
            NodeQueue nq = getTail();
            System.out.println(nq.getData());
            nq.setNextPointer(node);
        }
        this.size++;
    }

    public NodeQueue dequeue() {
        NodeQueue nq = this.head.getNextPointer();
        this.head.setNextPointer(nq.getNextPointer());
        this.size--;
        return nq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("head -> ");
        NodeQueue nq = this.head.getNextPointer();
        int i = 0;
        while (i <= this.size) {
            
            sb.append(nq.getData());
            sb.append(" -> ");
            nq = nq.getNextPointer();
            i++;
        }
        sb.append("tail");

        return sb.toString();
    }
}
