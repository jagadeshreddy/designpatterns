package org.designpatterns.behavioural.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
