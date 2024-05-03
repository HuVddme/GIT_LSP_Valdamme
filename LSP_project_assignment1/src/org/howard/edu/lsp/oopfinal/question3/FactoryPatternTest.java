//JUnit test for Factory Pattern
package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactoryPatternTest {
    @Test
    public void testCircleCreation() {
        FactoryPattern factory = new FactoryPattern();
        Shape shape = factory.getShape("CIRCLE");
        assertTrue(shape instanceof Circle); // factory testing circle creation test
    }

    @Test
    public void testRectangleCreation() {
        FactoryPattern factory = new FactoryPattern();
        Shape shape = factory.getShape("RECTANGLE");
        assertTrue(shape instanceof Rectangle); // factory testing rectangle creation test
    }
}