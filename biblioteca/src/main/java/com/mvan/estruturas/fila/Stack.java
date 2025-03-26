package com.mvan.estruturas.fila;


public class Stack {
    public NodeQueue head;
    public int size;
    //ArrayList

    public Stack() {
        this.head = new NodeQueue();
    }

    private void addEmpty(NodeQueue nq) {
        this.head.setNextPointer(nq);
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    private NodeQueue getTail() {
        NodeQueue nq = this.head.getNextPointer();
        while(nq.getNextPointer() != null) {
            nq = nq.getNextPointer();
        }
        return nq;
    }

    public void push(NodeQueue nq) {
        if(isEmpty()) {
            addEmpty(nq);
        } else {
            getTail().setNextPointer(nq);
        }
        this.size++;
    }

    public NodeQueue pop() {
        int i = 0;
        if(isEmpty()) {
            throw new Error("A lista esta vazia");
        } else {
            NodeQueue nq = this.head.getNextPointer();
            while (i < this.size - 2) {
                nq = nq.getNextPointer();
                i++;
            }
            System.out.println(nq.getData());
            nq.setNextPointer(null);
            this.size--;
            return nq;
        }
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Head - ");
        
        NodeQueue nq = this.head.getNextPointer();
        int i = 0;
        while (i < this.size) {
            sb.append(nq.getData());
            sb.append(" -> ");
            nq = nq.getNextPointer();
            i++;
        }

        return sb.toString();
    }
}
