package org.designpatterns.behavioural.iterator;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = new ArrayListIterator<>(list);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
