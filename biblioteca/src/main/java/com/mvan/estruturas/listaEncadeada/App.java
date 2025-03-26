package com.mvan.estruturas.listaEncadeada;

public class App 
{
    public static void main( String[] args )
    {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addFirst(new Node("1"));
        lista.addFirst(new Node("new head"));
        lista.addLast(new Node("last"));
        lista.addLast(new Node("5"));
        lista.addLast(new Node("7"));
        lista.add(new Node("add por posição"), 3);
        lista.removeFirst();
        lista.removeLast();
        lista.remove(3);
        
        System.out.println(lista);
    }
}
