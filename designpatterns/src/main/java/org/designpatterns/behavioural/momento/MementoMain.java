package org.designpatterns.behavioural.momento;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker taker = new CareTaker();

        editor.setContext("Version 1");
        taker.add(editor.save());

        editor.setContext("Version 2");
        taker.add(editor.save());


        editor.setContext("Version 3");
        taker.add(editor.save());


        editor.setContext("Version 4");
        taker.add(editor.save());


        editor.setContext("Version 5");
        taker.add(editor.save());

        editor.restore(taker.get(1));


    }
}
