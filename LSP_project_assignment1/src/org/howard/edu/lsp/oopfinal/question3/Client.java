package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        FactoryPattern shapeFactory = new FactoryPattern();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw(); // create circle and draw

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw(); // create rectangle and draw
    }
}