package org.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Student student = new Student("john", "wick", 1);
        User user = student.clone();

    }
}
