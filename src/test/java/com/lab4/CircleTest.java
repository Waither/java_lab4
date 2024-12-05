package com.lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testGetArea() {
        Circle circle = new Circle("Test Circle", 7);
        double expectedArea = Math.PI * 7 * 7;
        assertEquals(expectedArea, circle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle("Test Circle", 7);
        double expectedPerimeter = 2 * Math.PI * 7;
        assertEquals(expectedPerimeter, circle.getPerimeter(), 0.0001);
    }

    @Test
    public void testParameters() {
        Circle circle = new Circle("Test Circle", 7);

        circle.setId(10);
        circle.setName("New Circle");
        circle.setRadius(10);

        double r = circle.getRadius();
    }
}