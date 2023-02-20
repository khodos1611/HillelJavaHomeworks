package org.hillel.java.pro.homeworks.task4;

public abstract class Animals {

    int runLimit;
    int swimLimit;

    static int  countEntities=0;

    public Animals() {
        this.runLimit = 0;
        this.swimLimit = 0;
        countEntities++;

    }

    public abstract void Run(int distance);

    public abstract void Swim(int distance);

    public static int getCountEntities() {
        return countEntities;
    }
}
