package org.designpatterns.behavioural.iterator;

import java.util.ArrayList;

public class ArrayListIterator<T> implements Iterator<T> {

    private final ArrayList<T> list;
    private int index;

    public ArrayListIterator(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size();
    }

    @Override
    public T next() {
        return this.list.get(index++);
    }
}
