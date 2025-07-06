package org.designpatterns.behavioural.momento;

public class TextEditor {
    private String context;

    public void setContext(String context) {
        this.context = context;
        System.out.println("Current Context : " + context);
    }

    public Memento save() {
        return new Memento(context);
    }

    public void restore(Memento memento) {
        setContext(memento.getState());
        System.out.println("Restored content: " + context);
    }
}
