package com.mvan.estruturas.listaDuplamenteEncadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.addFirst(new Node2P("1"));
        System.out.println(lista.head.getNextPointer().getPrevPointer().data);

    }
}
