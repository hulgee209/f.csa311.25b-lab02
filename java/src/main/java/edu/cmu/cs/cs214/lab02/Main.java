package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
     public static void main(String[] args) {

        // Rectangle (т.rectangle) объект үүсгэж байна.
        Shape rectangle = new Rectangle(2, 3); 
        // Renderer объект үүсгэж, rectangle-г зурж байна.
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        // Бүх дүрсийг ажиллаж байгааг харуулахын тулд Circle объект нэмэж байна.
        Shape circle = new Circle(5);
        // Renderer объект үүсгэж, circle-г зурж байна.
        Renderer cirrenderer = new Renderer(circle);
        cirrenderer.draw();
    }
}
