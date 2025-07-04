package org.designpatterns.creational.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @BeforeEach
    void setUp() {
        this.shapeFactory = new ShapeFactory();
    }

    @Test
    void testGetShapeCircle() {
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        assertNotNull(shape);
        assertInstanceOf(Circle.class, shape);
    }


    @Test
    void testGetShapeTriangle() {
        Shape shape = shapeFactory.getShape(ShapeType.TRIANGLE);
        assertNotNull(shape);
        assertInstanceOf(Triangle.class, shape);
    }

    @Test
    void testGetShapeRectangle() {
        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        assertNotNull(shape);
        assertInstanceOf(Rectangle.class, shape);
    }

    @Test
    void testException() {
        assertThrows(NullPointerException.class, () -> shapeFactory.getShape(null));
    }

}