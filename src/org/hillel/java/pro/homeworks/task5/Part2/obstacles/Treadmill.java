package org.hillel.java.pro.homeworks.task5.Part2.obstacles;

import org.hillel.java.pro.homeworks.task5.Part2.participants.Participant;

public class Treadmill implements Obstacle{

    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean Overcome(Participant person) {return person.run(this.length);
    }

    @Override
    public String toString() {
        return "Treadmill length=" + length;
    }
}
