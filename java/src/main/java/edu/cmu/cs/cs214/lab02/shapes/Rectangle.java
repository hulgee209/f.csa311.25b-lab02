package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double width;  // Rectangle-ийн өргөн
    private double height; // Rectangle-ийн өндөр

    // Конструктор: width ба height утгуудыг авч, Rectangle объект үүсгэж байна.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Өргөн (width) утгыг авч байгаа getter метод
    public double getWidth() {
        return width;
    }

    // Өндөр (height) утгыг авч байгаа getter метод
    public double getHeight() {
        return height;
    }

    // Shape интерфейсээс getArea методыг хэрэгжүүлж байна.
    // Rectangle-ийн талбайг тооцоолох (өндөр * өргөн)
    @Override
    public double getArea() {
        return height * width;
    }

}
