package com.mvan.estruturas.listaEncadeada;

public class App 
{
    public static void main( String[] args )
    {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addFirst(new Node("1"));
        lista.addFirst(new Node("new head"));
        lista.addLast(new Node("last"));
        lista.add(new Node("add por posição"), 1);
        //lista.removeFirst();
        //lista.removeLast();
        lista.remove(0);
        
        System.out.println(lista);
    }
}
