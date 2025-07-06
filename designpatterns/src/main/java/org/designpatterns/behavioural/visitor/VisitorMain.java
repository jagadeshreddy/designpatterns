package org.designpatterns.behavioural.visitor;

public class VisitorMain {
    public static void main(String[] args) {

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        Computer computer = new Computer();
        computer.accept(visitor);
    }
}
