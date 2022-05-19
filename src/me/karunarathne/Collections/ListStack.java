package me.karunarathne.Collections;

import java.util.ArrayList;

public class ListStack<T> {
    private ArrayList <T> data;
    private int pointer;

    public ListStack() {
        data = new ArrayList <T> ();
        pointer = 0;
    }

    public void push (T newItem) {
        data.add(newItem);
        pointer++ ;
    }

    public T pop () {
        if (pointer == 0) {
            throw new IllegalStateException("No items in the stack");
        }

        pointer -- ;
        T tempItem = data.get(pointer);
        data.set(pointer, null);
        return tempItem ;
    }

    public boolean contains (T item) {
        boolean found = false ;

        for (int i=0; i<pointer; i++) {
            if (data.get(i).equals(item)) {
                found = true;
                break ;
            }
        }

        return found ;
    }

    public T acess (T item) {
        while (pointer > 0) {
            T tempItem = pop();
            if (item.equals(tempItem)) {
                return tempItem;
            }
        }

        throw new IllegalArgumentException("No such item on the stack: " + item);
    }

    public int size () {
        return pointer ;
    }
}
