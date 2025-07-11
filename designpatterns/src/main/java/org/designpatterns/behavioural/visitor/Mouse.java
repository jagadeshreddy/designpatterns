package org.designpatterns.behavioural.visitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
