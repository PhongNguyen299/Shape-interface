package com.codegym;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Resizeable) System.out.println("Shape after resize: " + ((Resizeable)shape).resize());
            if(shape instanceof Colorable) ((Colorable) shape).howToColor();
        }
    }
}