package org.hillel.java.pro.homeworks.task4;

public class Cat extends Animals{

    static  int countCats=0;
    public Cat() {
        super();
        super.runLimit = 200;
        countCats++;
    }

    @Override
    public void Run(int distance) {
        if (distance > super.runLimit) System.out.println(" Кіт не пробіжить  "+distance+"м., має ліміт "+super.runLimit);
        else System.out.println(" Кіт пробіг "+distance+" м.");

    }

    @Override
    public void Swim(int distance) {
        System.out.println(" Кіт не вміє плавати. ");
    }

    public static int getCountCats() {
        return countCats;
    }
}
