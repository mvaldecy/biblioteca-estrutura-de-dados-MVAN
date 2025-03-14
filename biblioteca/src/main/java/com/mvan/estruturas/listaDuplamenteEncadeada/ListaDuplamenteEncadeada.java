package com.mvan.estruturas.listaDuplamenteEncadeada;

import com.mvan.estruturas.interfaces.Estrutura;

public class ListaDuplamenteEncadeada implements Estrutura<Node2P>{
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
        while (n.nextPointer != null) {
            sb.append(n.data + " <-> ");
            n = n.getNextPointer();
        }
        sb.append("trailer");
        sb.append(" | Size: " + this.size);

        return sb.toString();
    }

    

    @Override
    public void removeBydata(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeBydata'");
    }

    @Override
    public Node2P find(int position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public boolean contains(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public Node2P first() {
        return this.head.getNextPointer();
    }

    @Override
    public Node2P last() {
        return this.trailer.getPrevPointer();
    }

    @Override
    public void printFoward() {
        StringBuilder sb = new StringBuilder();
        sb.append("head <-> ");
        Node2P n = this.head.getNextPointer();
        while (n.nextPointer != null) {
            sb.append(n.data + " <-> ");
            n = n.getNextPointer();
        }
        sb.append("trailer");
        sb.append(" | Size: " + this.size);

        System.out.println(sb.toString());
    }

    @Override
    public void printBackward() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printBackward'");
    }

    @Override
    public void reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

    @Override
    public void order() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'order'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
}