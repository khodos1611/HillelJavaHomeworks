package org.hillel.java.pro.homeworks.task5.Part2.participants;

public class Cat extends Participant {

    public Cat(int runLimit, int jumpLimit) {
        super.runLimit = runLimit;
        super.jumpLimit = jumpLimit;
    }
    @Override
    public boolean Run(int length) {
        if (length<=super.runLimit){
            System.out.println("Cat overcome the Treadmill, run "+length);
            return true;
        }
        else{
            System.out.println("Cat don't overcome the Treadmill "+length+", run only "+super.runLimit);
            return false;
        }
    }

    @Override
    public boolean Jump(int height) {
        if (height<=super.jumpLimit){
            System.out.println("Cat overcome the Wall, jump "+ height);
            return true;
        }
        else{
            System.out.println("Cat don't overcome the Wall "+height+", jump only "+super.jumpLimit);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
