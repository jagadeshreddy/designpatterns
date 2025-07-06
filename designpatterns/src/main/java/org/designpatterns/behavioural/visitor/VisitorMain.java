package org.designpatterns.behavioural.visitor;

public class VisitorMain {
    public static void main(String[] args) {

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        Mouse mouse = new Mouse();
        mouse.accept(visitor);
    }
}
