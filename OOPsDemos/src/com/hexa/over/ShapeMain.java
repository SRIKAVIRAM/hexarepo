package com.hexa.over;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.area(12); 
        double circle = shape.area(50.0);
        System.out.println("Circle: " + circle);

        shape.area(10, 20); // Rectangle
        double triangle = shape.area(12, 15.0f);
        System.out.println("Triangle: " + triangle);
    }
}


