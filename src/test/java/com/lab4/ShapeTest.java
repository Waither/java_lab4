package com.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testShapeConstructorAndGetters() {
        Shape shape = new Shape("Circle", 12.56);

        assertEquals("Circle", shape.getName());
        assertEquals(12.56, shape.getArea());
    }

    @Test
    void testSetName() {
        Shape shape = new Shape("Circle", 12.56);
        shape.setName("Square");

        assertEquals("Square", shape.getName());
    }

    @Test
    void testSetArea() {
        Shape shape = new Shape("Circle", 12.56);
        shape.setArea(25.0);

        assertEquals(25.0, shape.getArea());
    }

    @Test
    void testSetId() {
        Shape shape = new Shape("Circle", 12.56);
        shape.setId(1);

        assertEquals(1, shape.getId());
    }

    @Test
    void testDefaultConstructor() {
        Shape shape = new Shape();

        assertNotNull(shape);
    }
}
