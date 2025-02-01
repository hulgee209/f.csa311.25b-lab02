package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {

    private Shape shape; // Shape объект хадгалах хувьсагч

    // Конструктор: shape объект дамжуулан Renderer объект үүсгэж байна.
    public Renderer(Shape shape) {
        this.shape = shape;
    }

    // draw метод: shape объектын талбайг тооцоолж, хэвлэж байна.
    public void draw() {
        
        // shape объектын талбайг авна (getArea метод ашиглан)
        double area = shape.getArea(); 

        // Shape-ийн нэр болон талбайг дэлгэцэнд гаргана
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
