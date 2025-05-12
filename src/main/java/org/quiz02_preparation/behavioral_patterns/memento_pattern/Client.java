package org.quiz02_preparation.behavioral_patterns.memento_pattern;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        System.out.println("Read: \"" + editor.read() + "\"");

        editor.write("Merhaba");
        history.save(editor);

        editor.write(", dünya");
        history.save(editor);

        editor.write("!");
        System.out.println("After writes: " + editor.read());

        history.undo(editor);
        System.out.println("After undo 1: " + editor.read());

        history.undo(editor);
        System.out.println("After undo 2: " + editor.read());
    }
}
