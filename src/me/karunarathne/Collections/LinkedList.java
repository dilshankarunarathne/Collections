package me.karunarathne.Collections;

public class LinkedList <T> implements LinkedListI {
    private Node current ;
    public int length ;

    @Override
    public void addItem (T item) {
        current = new Node(item, current) ;
        length ++ ;
    }
    
    @Override
    public Object getItemAtLast() {
        return null;
    }

    @Override
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
}