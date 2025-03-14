package com.mvan.estruturas.interfaces;

public interface Estrutura<T> {
    void addFirst(T node);
    void addLast(T node);
    void addAt(T node, int position);
    void removeFirst();
    void removeLast();
    void removeAt(int position);
    void removeBydata(String data);
    T find(int position);
    boolean contains(String data);
    int length();

    T first();
    T last();
    void printFoward();
    void printBackward();

    void reverse();
    void order();
    void clear();

}
