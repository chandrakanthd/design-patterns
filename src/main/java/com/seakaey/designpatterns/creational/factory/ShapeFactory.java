package com.seakaey.designpatterns.creational.factory;

public class ShapeFactory {
    public Shape getShape(String shapeName) throws Exception {
        if (shapeName == null) {
            throw new Exception("Shape cannot be null");
        }

        switch (shapeName.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default: {
                throw new IllegalArgumentException("Invalid Shape");
            }
        }
    }
}
