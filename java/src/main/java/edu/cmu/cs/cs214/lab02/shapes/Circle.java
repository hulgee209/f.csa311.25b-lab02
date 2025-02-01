package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius; // Circle объектын радиус

    // Конструктор: radius утгыг авч, Circle объект үүсгэж байна.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Радиусыг авч байгаа getter метод
    public double getRadius() {
        return radius;
    }
    
    // Shape интерфейсээс getArea методыг хэрэгжүүлж байна.
    // Circle-ийн талбайг тооцоолох (π * радиус^2)
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
