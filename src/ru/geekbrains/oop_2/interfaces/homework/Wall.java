package ru.geekbrains.oop_2.interfaces.homework;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean pass(Participant participant) {
        if(participant.jump(this.height)) {
            System.out.printf("%s passed wall(%d cm)\n", participant.getName(), height);
            return true;
        }
        System.out.printf("%s failed to pass wall(%d cm)\n", participant.getName(), height);
        return false;
    }
}
