package org.hillel.java.pro.homeworks.task5.Part2.participants;

public abstract class Participant {

    int runLimit;
    int jumpLimit;

    public boolean Run(int length){
        System.out.println("Run");
        return true;
    }

    public boolean Jump(int height){
        System.out.println("Jump");
        return true;
    }

 }
