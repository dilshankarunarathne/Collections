package me.karunarathne.Collections;

public class LinkedList <T> {
    private Node current ;
    public int length ;

    public void addItem (T item) {
        Node newNode = new Node(item) ;

    }
}

class Node <T> {
    private T current ;
    Node next ;
    Node prev ;

    public Node(T current, Node prev) {
        this.current = current;
        this.prev = prev ;
    }
}