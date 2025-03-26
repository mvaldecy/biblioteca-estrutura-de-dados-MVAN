package com.mvan.estruturas.listaDuplamenteEncadeada;

public class ListaCircularDuplamenteEncadeada {
    Node2P head;
    int size;

    public ListaCircularDuplamenteEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void addEmpty(Node2P node) {
        this.head = node;
        node.setNextPointer(node);
        node.setPrevPointer(node);
        this.size++;
    }

    private void checkPosition(int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Insira uma posição válida");
        }
    }

    public void addFirst(Node2P n) {
        if (this.size == 0) {
            addEmpty(n);
        } else {
            n.setNextPointer(this.head);
            n.setPrevPointer(this.head);
            this.head = n;
            this.size++;
        }
    }

    public void addLast(Node2P n) {
        if (this.size == 0) {
            addEmpty(n);
        } else {
            n.setNextPointer(this.head);
            n.setPrevPointer(this.head.getPrevPointer());
            this.head.getPrevPointer().setNextPointer(n);
            this.head.setPrevPointer(n);
            this.size++;
        }
    }

    public void add(Node2P node, int pos) {
        checkPosition(pos);
        if(pos == 0) {
            addFirst(node);
        } else if (pos == this.size) {
            addLast(node);
        } else {
            int i = 0;
            Node2P n = this.head;

            while(i < pos - 1) {
                n = n.getNextPointer();
                i++;
            }
            node.setNextPointer(n.getNextPointer());
            node.setPrevPointer(n);
            n.getNextPointer().setPrevPointer(node);
            n.setNextPointer(node);
            this.size++;
        }
    }

    public Node2P removeFirst() {
        Node2P trash = this.head;

        this.head = trash.getNextPointer();
        trash.getPrevPointer().setNextPointer(this.head);
        this.head.setPrevPointer(trash.getPrevPointer());

        trash.setNextPointer(null);
        trash.setPrevPointer(null);

        this.size--;
        return trash;
    }

    public Node2P removeLast() {
        Node2P trash = this.head.getPrevPointer();
        
        trash.getPrevPointer().setNextPointer(this.head);
        this.head.setPrevPointer(trash.getPrevPointer());

        trash.setNextPointer(null);
        trash.setPrevPointer(null);

        this.size--;
        return trash;
    }

    public Node2P remove(int pos) {
        checkPosition(pos);
        if(pos == 0) {
            return removeFirst();
        } else if (pos == this.size - 1) {
            return removeLast();
        } else {
            Node2P trash = this.head;
            
            int i = 0;
            while(i < pos) {
                trash = trash.getNextPointer();
                i++;
            }

            trash.getPrevPointer().setNextPointer(trash.getNextPointer());
            trash.getNextPointer().setPrevPointer(trash.getPrevPointer());

            trash.setNextPointer(null);
            trash.setPrevPointer(null);

            
            this.size--;
            return trash;
        }
    }

    public void log() {
        StringBuilder sb = new StringBuilder();
        sb.append("Head - ");
        int i = 0;
        Node2P n = this.head;
        while(i <= this.size) {
            sb.append(n.getData());
            sb.append(" <-> ");
            n = n.getNextPointer();
            i++;
        }

        System.out.println(sb.toString());
    }

    



    
}
