package com.mvan.estruturas.listaDuplamenteEncadeada;

public class ListaCircularDuplamenteEncadeada {
    Node2P head;
    int size;

    public ListaCircularDuplamenteEncadeada() {
        this.head = null;
        this.size = 0;
    }

    private void addEmpty(Node2P node) {
        this.head = node;
        node.setNextPointer(node);
        node.setPrevPointer(node);
    }

    private void checkPosition(int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Insira uma posição válida");
        }
    }

    



    
}
