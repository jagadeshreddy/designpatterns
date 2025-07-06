package org.designpatterns.behavioural.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<Memento> history = new ArrayList<>();

    public void add(Memento memento) {
        this.history.add(memento);
    }

    public Memento get(int index) {
        return this.history.get(index);
    }
}
