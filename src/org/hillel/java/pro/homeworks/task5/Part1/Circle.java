package org.hillel.java.pro.homeworks.task5.Part1;

public class Circle implements Figure{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Figure.PI * radius * radius;
    }
}
