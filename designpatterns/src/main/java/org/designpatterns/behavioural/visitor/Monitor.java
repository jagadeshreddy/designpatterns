package org.designpatterns.behavioural.visitor;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
