package org.designpatterns.behavioural.interpreter;

//Terminal Expression
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interept() {
        return number;
    }
}
