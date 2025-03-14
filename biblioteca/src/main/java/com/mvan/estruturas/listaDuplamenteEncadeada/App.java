package com.mvan.estruturas.listaDuplamenteEncadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.addFirst(new Node2P("1"));
        lista.addLast(new Node2P("2"));
        lista.addLast(new Node2P("3"));
        lista.addLast(new Node2P("4"));
        lista.addLast(new Node2P("5"));
        lista.addAt(new Node2P("add position"), 3);
        // lista.removeFirst();
        // lista.removeLast();
        // lista.remove(4);
        lista.printFoward();;

    }
}
