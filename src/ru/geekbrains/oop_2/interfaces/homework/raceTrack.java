package ru.geekbrains.oop_2.interfaces.homework;

public class raceTrack implements Obstacle{
    private int length;

    public raceTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        if(participant.run(this.length)) {
            System.out.printf("%s passed racetrack(%d m)\n", participant.getName(), length);
            return true;
        }
        System.out.printf("%s failed to pass racetrack(%d m)\n", participant.getName(), length);
        return false;
    }
}
