package org.designpatterns.behavioural.strategy;

public class ApplicationContext {
    private Strategy strategy;

    public ApplicationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return strategy.execute(a, b);
    }
}
