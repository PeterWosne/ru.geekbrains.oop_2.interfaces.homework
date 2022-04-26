package ru.geekbrains.oop_2.interfaces.homework;

import java.util.concurrent.TimeUnit;

public class Competition {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Participant[] team = {
                new Human("girl", 3000, 100),
                new Human("boy", 7000, 150 ),
                new Cat("tom", 500, 199),
                new Cat("blacky", 300, 90),
                new Robot("robotron_3m2", 10000, 1000),
                new Robot("quadro_reaper", 30000, 0)
        };

        Obstacle[] obstacles = {
                new Wall(100),
                new raceTrack(3000),
                new Wall(150),
                new Wall(200)
        };

        for(Participant p : team) {
            for(Obstacle o : obstacles) {
                TimeUnit.SECONDS.sleep(1);
                if(!o.pass(p)) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
