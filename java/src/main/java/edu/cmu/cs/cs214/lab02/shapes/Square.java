package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen; // Square объектын талбар буюу тал хажуугийн урт

    // Конструктор: sideLen утгыг авч, Square объект үүсгэж байна.
    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    // Tal hajuug haruulj bui getter metod
    public double getSideLen() {
        return sideLen;
    }
    
    // Shape интерфейсээс getArea методыг хэрэгжүүлж байна.
    // Square-ийн талбайг тооцоолох (тал хажуугийн урт * тал хажуугийн урт)
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
