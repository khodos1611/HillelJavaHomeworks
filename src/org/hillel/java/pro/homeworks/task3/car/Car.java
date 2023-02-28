package org.hillel.java.pro.homeworks.task3.car;

public class Car {

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("start");
    }

    private void startCommand(){
        System.out.println("command");
    }

    private void startFuelSystem(){
        System.out.println("fuel system");
    }
}
