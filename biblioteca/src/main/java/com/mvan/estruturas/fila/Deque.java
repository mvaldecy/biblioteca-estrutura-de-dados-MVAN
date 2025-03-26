package com.mvan.estruturas.fila;

import com.mvan.estruturas.listaDuplamenteEncadeada.Node2P;

// duplamente encadeado
public class Deque {
    int size;
    Node2P head;
    Node2P tail;

    public Deque() {
        this.head = new Node2P();
        this.tail = new Node2P();
        this.head.setNextPointer(tail);
        this.tail.setPrevPointer(head);
        this.size = 0;
    }

    public Deque insertStart(Node2P n) {
        n.setNextPointer(this.head.getNextPointer());
        n.setPrevPointer(this.head);
        this.head.getNextPointer().setPrevPointer(n);
        this.head.setNextPointer(n);
        this.size++;
        return this;
    }

    public Deque insertEnd(Node2P n) {
        n.setNextPointer(this.tail);
        n.setPrevPointer(this.tail.getPrevPointer());
        this.tail.getPrevPointer().setNextPointer(n);
        this.tail.setPrevPointer(n);
        this.size++;
        return this;
    }

    public Node2P deleteStart() {
        Node2P n = this.head.getNextPointer();
        this.head.setNextPointer(n.getNextPointer());
        n.getNextPointer().setPrevPointer(this.head);
        n.setNextPointer(null);
        n.setPrevPointer(null);
        this.size--;
        return n;
    }

    public Node2P deleteEnd() {
        Node2P n = this.tail.getPrevPointer();
        this.tail.setPrevPointer(n.getPrevPointer());
        n.getPrevPointer().setNextPointer(this.tail);
        n.removePointers();
        this.size--;
        return n;
    }

    public Deque rotate(int k) {
        if(k > 0) {
            int i = 0;
            System.out.println(k);
            while (i < k) {
                Node2P n = this.deleteStart();
                this.insertEnd(n);
                i++;
            }
        } else if (k < 0) {
            k = Math.abs(k);
            int i = 0;
            while (i < k) {
                Node2P n = this.deleteEnd();
                this.insertStart(n);
                i++;
            }
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("head -> ");
        Node2P nq = this.head.getNextPointer();
        int i = 0;
        while (i < this.size) {
            
            sb.append(nq.getData());
            sb.append(" -> ");
            nq = nq.getNextPointer();
            i++;
        }
        sb.append("tail");

        return sb.toString();
    }


    public Deque log() {
        System.out.println(this.toString());
        return this;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.insertEnd(new Node2P("1"))
            .insertEnd(new Node2P("2"))
            .insertEnd(new Node2P("3"))
            .insertEnd(new Node2P("4"))
            .rotate(4)
            .log()
            .rotate(-7)
            .log();
        
    }
}
