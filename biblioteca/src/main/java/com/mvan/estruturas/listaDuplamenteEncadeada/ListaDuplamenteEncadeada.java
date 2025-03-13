package com.mvan.estruturas.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    public Node2P head;
    public Node2P trailer;
    public int size;
    
    public ListaDuplamenteEncadeada() {
        this.head = new Node2P("head");
        this.trailer = new Node2P("trailer");
        this.head.setNextPointer(trailer);
        trailer.setPrevPointer(head);
        this.size = 0;
    }

    public void addFirst(Node2P node) {
        node.setNextPointer(this.head.getNextPointer());
        node.setPrevPointer(this.head);
        head.getNextPointer().setPrevPointer(node);
        head.setNextPointer(node);
        this.size++;
    }
}