package org.hillel.java.pro.homeworks.task5;

import org.hillel.java.pro.homeworks.task5.Part1.Circle;
import org.hillel.java.pro.homeworks.task5.Part1.Figure;
import org.hillel.java.pro.homeworks.task5.Part1.Square;
import org.hillel.java.pro.homeworks.task5.Part1.Triangle;
import org.hillel.java.pro.homeworks.task5.Part2.obstacles.Obstacle;
import org.hillel.java.pro.homeworks.task5.Part2.obstacles.Treadmill;
import org.hillel.java.pro.homeworks.task5.Part2.obstacles.Wall;
import org.hillel.java.pro.homeworks.task5.Part2.participants.Cat;
import org.hillel.java.pro.homeworks.task5.Part2.participants.Human;
import org.hillel.java.pro.homeworks.task5.Part2.participants.Participant;
import org.hillel.java.pro.homeworks.task5.Part2.participants.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //part1
        System.out.println(" ====Part #1======= ");
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(15));
        figures.add(new Triangle(10, 7, 18));
        figures.add(new Triangle(5, 8, 10));
        figures.add(new Square(24));

        printFiguresTotalArea(figures);

        //part2
        System.out.println(" ====Part #2======= ");
        Participant[] members = new Participant[3];
        Obstacle[] stopers = new Obstacle[2];

        members[0] = new Human(1500, 2);
        members[1] = new Cat(2000, 5);
        members[2] = new Robot(10000, 10);

        stopers[0] = new Treadmill(1800);
        stopers[1] = new Wall(2);

        for (Participant member:members ) {
            for (Obstacle stop:stopers) {
                if (!stop.Overcome(member)) break;
            }
        }
    }

    public static void printFiguresTotalArea(List<Figure> objects){

        final double[] totalArea = {0};

        objects.forEach(t -> {
            double objectArea = t.getArea();
            totalArea[0] += objectArea;
            System.out.println("area of " + t.toString()  + " = " +objectArea);
        });

        System.out.println("total area of figures = " + totalArea[0]);
    }
}
