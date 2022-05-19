package me.karunarathne.Collections;

public class LinkedList <T> {
    private Node current ;
    public int length ;

    public void addItem (T item) {
        Node newNode = new Node(item) ;
    }
}

class Node <T> {
    T current ;
    Node next ;
    Node prev ;
}