package com.mvan.estruturas.revisaoP1;

import com.mvan.estruturas.fila.Deque;
import com.mvan.estruturas.listaDuplamenteEncadeada.ListaCircularDuplamenteEncadeada;
import com.mvan.estruturas.listaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import com.mvan.estruturas.listaDuplamenteEncadeada.Node2P;
import com.mvan.estruturas.listaEncadeada.ListaEncadeada;
import com.mvan.estruturas.listaEncadeada.Node;

public class App {

    public static void q1() {
        Deque deque = new Deque();
        deque.insertEnd(new Node2P("1"));
        deque.insertEnd(new Node2P("2"));
        deque.insertEnd(new Node2P("3"));
        deque.insertEnd(new Node2P("4"));
        deque.insertEnd(new Node2P("8"));
        //deque.deleteEnd();
        //deque.deleteStart();
        System.out.println(deque);
        deque.rotate(6);
        System.out.println(deque);
    }

    public static void q2() {
        ListaEncadeada list = new ListaEncadeada();
        list.addLast(new Node("0"));
        list.addLast(new Node("1"));
        list.addLast(new Node("2"));
        list.addLast(new Node("3"));
        list.addLast(new Node("4"));
        list.addLast(new Node("5"));
        list.addLast(new Node("6"));
        System.out.println(list);

        ListaEncadeada oddList = new ListaEncadeada();
        ListaEncadeada evenList = new ListaEncadeada();

        int i = 0;
        while (!list.isEmpty()) {
            if(i % 2 == 0) {
                evenList.addLast(list.removeFirst());
            } else if (i % 2 != 0 ) {
                oddList.addLast(list.removeFirst());
            }
            i++;
        }

        System.out.println(evenList);
        System.out.println(oddList);
    }

    public static void q3() {
        ListaCircularDuplamenteEncadeada lcde = new ListaCircularDuplamenteEncadeada();
        lcde.addFirst(new Node2P("1"));
        lcde.addLast(new Node2P("2"));
        lcde.addLast(new Node2P("3"));
        lcde.addLast(new Node2P("4"));
        lcde.addLast(new Node2P("5"));

        lcde.log();

        
        int i = 0;
        while (i < lcde.getSize()) {
            lcde.addLast(lcde.removeFirst());
            i++;
        }

        lcde.log();
    }

    public static void q4() {
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
        q3();
    }
}
