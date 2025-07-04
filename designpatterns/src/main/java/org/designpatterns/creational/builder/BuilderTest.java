package org.designpatterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("da")
                .build();
    }
}
