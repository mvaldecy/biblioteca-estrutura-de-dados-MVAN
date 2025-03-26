package com.mvan.estruturas.fila;

public class App {

    public static void runQueue() {
        Queue q = new Queue();
        q.enqueue(new NodeQueue("1"));
        q.enqueue(new NodeQueue("2"));
        q.enqueue(new NodeQueue("3"));
        q.enqueue(new NodeQueue("4"));
        q.enqueue(new NodeQueue("5"));
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }

    public static void runPriorityQueue() {
        PriorityQueue pq = new PriorityQueue();
        
        pq.setPriorityInterval(1, 10);
        pq.enqueue(new NodeQueue("teste 1", 5));
        pq.enqueue(new NodeQueue("teste 2", 7));
        pq.enqueue(new NodeQueue("teste 3", 4));
        pq.enqueue(new NodeQueue("teste 4", 4));
        System.out.println(pq);
        pq.dequeue();
        pq.dequeue();
        System.out.println(pq);
    }

    public static void runStack() {
        Stack stack = new Stack();
        stack.push(new NodeQueue("1"));
        stack.push(new NodeQueue("2"));
        stack.push(new NodeQueue("3"));
        stack.push(new NodeQueue("4"));
        stack.push(new NodeQueue("5"));
        stack.push(new NodeQueue("6"));
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
    public static void main(String[] args) {
        //runQueue();
        //runPriorityQueue();
        runStack();
    }
}
