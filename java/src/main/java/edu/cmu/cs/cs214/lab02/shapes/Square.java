package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen() {
        return sideLen;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
