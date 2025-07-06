package org.designpatterns.behavioural.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Strategy addition = new AddStrategy();
        ApplicationContext context = new ApplicationContext(addition);
        System.out.println("Using Addition Strategy = " + context.execute(10, 10));

        Strategy subtraction = new SubtractStrategy();
        context.setStrategy(subtraction);
        System.out.println("Using Subtraction Strategy = " + context.execute(20, 10));

    }
}
