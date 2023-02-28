package org.hillel.java.pro.homeworks.task5.Part2.participants;

public abstract class Participant {

    int runLimit;
    int jumpLimit;

    public  abstract boolean run(int length);

    public abstract boolean jump(int height);

 }
