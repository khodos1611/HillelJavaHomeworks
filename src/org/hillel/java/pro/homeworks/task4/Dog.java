package org.hillel.java.pro.homeworks.task4;

public class Dog extends Animals{

    static int countDogs=0;
    public Dog() {
        super();
        super.runLimit = 500;
        super.swimLimit = 10;
        countDogs++;
    }

    @Override
    public void Run(int distance) {
        if (distance > super.runLimit) System.out.println("Пес не пробіжить  "+distance+" м., має ліміт "+super.runLimit);
        else System.out.println(" Пес пробіг "+distance+" м.");

    }

    @Override
    public void Swim(int distance) {
        if (distance > super.swimLimit) System.out.println("Пес не пропливе  "+distance+" м., має ліміт "+super.swimLimit);
        else System.out.println("Пес проплив "+distance+" м.");
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
