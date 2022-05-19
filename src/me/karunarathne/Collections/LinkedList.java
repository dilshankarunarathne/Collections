package me.karunarathne.Collections;

public class LinkedList <T> {
    private Node current ;
    public int length ;

    public void addItem (T item) {
        current = new Node(item, current) ;
        length ++ ;
    }

    public T getItemAtLast() {
        return (T) current.getCurrent() ;
    }

    public void removeItem() {

    }
}

class Node <T> {
    private T current ;
    private Node next ;
    private Node prev ;

    public Node(T current, Node prev) {
        this.current = current;
        this.prev = prev ;
        next = null ;
    }

    public T getCurrent() {
        return current;
    }
}