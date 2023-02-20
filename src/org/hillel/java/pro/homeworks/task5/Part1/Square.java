package org.hillel.java.pro.homeworks.task5.Part1;

public class Square implements Figure{

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square" ;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
