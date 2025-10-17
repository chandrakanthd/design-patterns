package com.seakaey.designpatterns.creational.factory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shape name: ");
        String shapeName = scanner.nextLine();
        scanner.close();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(shapeName);
        shape.draw();
    }
}
