package com.mvan.estruturas.listaEncadeada;

public class ListaEncadeada {
    protected Node head;
    protected int size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public Node getTrailer() {
        Node node = this.head;
        while (node.getPointer() != null) {
            node = node.getPointer();
        }
        return node;
    }

    public void addFirst(Node node) {
        node.setPointer(head);
        this.head = node;
        this.size++;
    }

    public void addLast(Node node) {
        Node n = this.head;
        while (node.getPointer() != null) {
            n = n.getPointer();
        }

        n.getPointer().setPointer(node);
        
        this.size++;
    }

    private void checkPosition(int position) {
        if (position < 0 || position > size - 1) {
            throw new IllegalArgumentException("Insira uma posição válida");
        }
    }

    public void add(Node node, int position) {

        checkPosition(position);

        Node n = this.head;
        int i = 0;
        while (i < (position - 1)) {
            n = n.getPointer();
            i++;
        }
        
        node.setPointer(n.getPointer());
        n.setPointer(node);
        this.size++;
    }

    public void removeFirst() {
        this.head = head.getPointer();
        this.size--;
    }
    public void removeLast() {
        if (this.size < 1) {
            throw new Error("Lista vazia");
        }

        Node n = this.head;
        int i = 0;

        while (i < (size - 2)) {
            n = n.getPointer();
            i++;
        }

        n.setPointer(null);
        this.size--;

    }

    public void remove(int position){
        checkPosition(position);

        Node n = this.head;
        int i = 0;

        if (position == 0) {
            removeFirst();
        } else if (position == this.size - 1) {
            removeLast();
        } else {

        

        while(i < (position - 1)) {
            n = n.getPointer();
            i++;
        }

        n.setPointer(n.getPointer().getPointer());
        this.size--;
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada [head=" + head + ", size=" + size + "]";
    }

    


}
