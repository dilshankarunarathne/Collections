package me.karunarathne.Collections;

public class ArrayStack<T> {
    private T [] data;
    private int pointer;

    public ArrayStack() {
        data = (T []) new Object [1000];
        pointer = 0;
    }

    public void push (T newItem) {
        data [pointer++] = newItem ;
    }

    public T pop () {
        if (pointer == 0) {
            throw new IllegalStateException("No items in the stack");
        }

        return data [--pointer] ;
    }

    public boolean contains (T item) {
        boolean found = false ;

        for (int i=0; i<pointer; i++) {
            if (data[i].equals(item)) {
                found = true ;
                break ;
            }
        }

        return found;
    }

    public T access (T item) {
        while (pointer > 0) {
            T tempItem = pop();
            if (item.equals(tempItem)) {
                return tempItem ;
            }
        }

        throw new IllegalArgumentException("No such item on the stack: " + item);
    }

    public int size () {
        return pointer ;
    }
}
