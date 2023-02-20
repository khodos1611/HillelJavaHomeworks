package org.hillel.java.pro.homeworks.task5.Part1;

public class Triangle implements Figure{

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        double p= (side1+side2+side3)/2.0;
        if ((p<side1) || (p<side2) || (p<side3)) {
            System.out.println("can't obtain area of triangle");
            return 0;
        }
        return  Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
}
