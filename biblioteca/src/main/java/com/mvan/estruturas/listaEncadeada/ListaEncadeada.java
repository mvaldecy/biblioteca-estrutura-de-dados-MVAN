package com.mvan.estruturas.listaEncadeada;

public class ListaEncadeada {
    protected Node head;
    protected int size;

    public ListaEncadeada() {
        this.head = new Node();
        this.size = 0;
    }

    public void addFirst(Node n) {
        n.setNextPointer(this.head.getNextPointer());
        this.head.setNextPointer(n);
        this.size++;
    }

    public void addLast(Node node) {
        if (this.size == 0) {
            addFirst(node);
        } else {

        
        Node n = this.head.getNextPointer();
        while (n.getNextPointer() != null) {

            n = n.getNextPointer();
        }
        n.setNextPointer(node);
        this.size++;
        }
    }

    
    private void checkPosition(int pos) {
        if(pos < 0 || pos > this.size) {
            throw new Error("Insira uma posição válida");
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    
    public void add(Node node, int pos) {
        checkPosition(pos);
        if (this.size == 0) {
            addFirst(node);
        } else if (this.size == pos) {
            addLast(node);
        } else {
            int i = 0;
            Node n = this.head.getNextPointer();
            while(i < pos - 1) {
                n = n.getNextPointer();
                i++;
            }
            node.setNextPointer(n.getNextPointer());
            n.setNextPointer(node);
            this.size++;
        }
    }

    public Node removeFirst() {
        if(isEmpty()) throw new Error("Lista vazia");
        Node n = this.head.getNextPointer();
        this.head.setNextPointer(n.getNextPointer());
        n.setNextPointer(null);
        this.size--;
        return n;
    }

    public Node removeLast() {
        if(isEmpty()) throw new Error("lista vazia");
        Node n = this.head.getNextPointer();
        int i = 0;
        while( i < this.size - 2) {
            n = n.getNextPointer();
            i++;
        }
        Node trash = n.getNextPointer();
        n.setNextPointer(null);
        trash.setNextPointer(null);
        this.size--;
        return trash;
    }

    public Node remove(int pos) {
        checkPosition(pos);
        if (this.size == 0) {
            return removeFirst();
        } else if (pos == this.size - 1) {
            return removeLast();
        } else {
            int i = 0;
            Node n = this.head.getNextPointer();
            while(i < pos - 1) {
                n = n.getNextPointer();
                i++;
            }
            Node trash = n.getNextPointer();
            n.setNextPointer(trash.getNextPointer());
            trash.setNextPointer(null);
            this.size--;
            return trash;
        }
    }


    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Head -> ");
        int i = 0;
        Node n = this.head.getNextPointer();
        while (i < this.size) {
            sb.append(n.getData());
            sb.append(" -> ");
            n = n.getNextPointer();
            i++;
        }

        return sb.toString();
        
    }

    


}
