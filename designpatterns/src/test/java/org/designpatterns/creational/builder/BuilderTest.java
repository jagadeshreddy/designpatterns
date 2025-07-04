package org.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void testBuilder() {
        Computer computer = new Computer.Builder()
                .cpu("cpu")
                .gpu("gpu")
                .build();

        assertNull(computer.getRam());
        assertEquals("gpu", computer.getGpu());
        assertEquals("cpu", computer.getCpu());
    }

}