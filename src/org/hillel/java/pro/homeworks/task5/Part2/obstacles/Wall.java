package org.hillel.java.pro.homeworks.task5.Part2.obstacles;

import org.hillel.java.pro.homeworks.task5.Part2.participants.Participant;

public class Wall extends Obstacle{

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean Overcome(Participant person) {
        return  person.Jump(this.height);
    }

    @Override
    public String toString() {
        return "Wall height=" + height;
    }
}
