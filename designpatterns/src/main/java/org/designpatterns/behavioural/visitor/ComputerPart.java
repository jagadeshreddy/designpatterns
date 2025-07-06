package org.designpatterns.behavioural.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
