package com.mvan.estruturas.listaDuplamenteEncadeada;


public class ListaDuplamenteEncadeada{
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

    private void checkPosition(int position) {
        if (position < 0 || position > this.size) {
            throw new IllegalArgumentException("Insira uma posição válida");
        }
    }

    public void addFirst(Node2P node) {
        node.setNextPointer(this.head.getNextPointer());
        node.setPrevPointer(this.head);
        head.getNextPointer().setPrevPointer(node);
        head.setNextPointer(node);
        this.size++;
    }

    public void addLast(Node2P node) {
        node.setNextPointer(this.trailer);
        node.setPrevPointer(this.trailer.getPrevPointer());
        trailer.getPrevPointer().setNextPointer(node);
        trailer.setPrevPointer(node);
        this.size++;
    }

    public void addAt(Node2P node, int position) {
        checkPosition(position);
        if (position == 0) {
            addFirst(node);
        } else if (position == size) {
            addLast(node);
        } else {

            Node2P n = head.getNextPointer();
            int i = 0;
            while (i < (position - 1)) {
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

    public void removeFirst() {
        Node2P trash = this.head.getNextPointer();
        this.head.setNextPointer(trash.getNextPointer());
        trash.getNextPointer().setPrevPointer(this.head);
        this.size--;
    }

    public void removeLast() {
        Node2P trash = this.trailer.getPrevPointer();
        this.trailer.setPrevPointer(trash.getPrevPointer());
        trash.getPrevPointer().setNextPointer(this.trailer);
        this.size--;
    }

    public void removeAt(int position) {
        checkPosition(position);
        if(position == 0) {
            removeFirst();
        } else if (position == this.size - 1) {
            removeLast();
        } else {
            Node2P n = this.head.getNextPointer();
            int i = 0;

            while(i < position) {
                n = n.getNextPointer();
                i++;
            } // n vai ser o elemento que será removido
            n.getNextPointer().setPrevPointer(n.getPrevPointer());
            n.getPrevPointer().setNextPointer(n.getNextPointer());
            this.size--;
            
        }

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("head <-> ");
        Node2P n = this.head.getNextPointer();
        int i = 0;
        while (i < this.size - 1) {
            sb.append(n.data + " <-> ");
            n = n.getNextPointer();
            i++;
        }
        sb.append("trailer");
        sb.append(" | Size: " + this.size);

        return sb.toString();
    }

    

    
    
    public Node2P first() {
        return this.head.getNextPointer();
    }

    
    public Node2P last() {
        return this.trailer.getPrevPointer();
    }

    
    public void printFoward() {
        StringBuilder sb = new StringBuilder();
        sb.append("head <-> ");
        Node2P n = this.head.getNextPointer();
        while (n != this.trailer) {
            sb.append(n.data + " <-> ");
            n = n.getNextPointer();
            
        }
        sb.append("trailer");
        sb.append(" | Size: " + this.size);

        System.out.println(sb.toString());
    }

    
    public void reverse() {
        Node2P n = this.head;
        while (n != null) {
            Node2P aux = n.getNextPointer();
            n.setNextPointer(n.getPrevPointer());
            n.setPrevPointer(aux);
            n = aux;
            
        }   
        Node2P l = this.head;
        this.head = this.trailer;
        this.trailer = l;

    }

    
}