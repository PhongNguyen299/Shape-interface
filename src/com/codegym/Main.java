package com.codegym;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (Shape shape : shapes) {
            System.out.println("Shape after resize: "+ ((Resizeable)shape).resize());
        }
    }
}