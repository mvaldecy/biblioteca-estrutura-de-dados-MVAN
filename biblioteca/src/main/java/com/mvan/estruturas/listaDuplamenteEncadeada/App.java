package com.mvan.estruturas.listaDuplamenteEncadeada;

public class App {

    public static void listaCircular() {
        ListaCircularDuplamenteEncadeada lcde = new ListaCircularDuplamenteEncadeada();
        lcde.addFirst(new Node2P("1"));
        lcde.addLast(new Node2P("2"));
        lcde.addLast(new Node2P("3"));
        lcde.addLast(new Node2P("4"));
        lcde.addLast(new Node2P("5"));
        lcde.add(new Node2P("add position"), 3);
        lcde.log();
        //lcde.removeFirst();
        //lcde.log();
        //lcde.removeLast();
        //lcde.log();
        lcde.remove(3);
        lcde.log();
        System.out.println(lcde.head.getPrevPointer().data);
    }


    public static void lde() {
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
        lista.printFoward();
        lista.reverse();
        lista.printFoward();
    }
    public static void main(String[] args) {
       // lde();
       listaCircular();
    }
}
