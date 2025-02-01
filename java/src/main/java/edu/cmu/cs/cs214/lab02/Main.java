package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
     public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 3); 
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        //buh dursiig ajilj buig haruulahin tuld circle-g nemj ajilluulav.
        Shape circle = new Circle(5);
        Renderer cirrenderer = new Renderer(circle);
        cirrenderer.draw();
    }
}
