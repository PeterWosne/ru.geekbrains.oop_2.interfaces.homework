package ru.geekbrains.oop_2.interfaces.homework;

public class Cat implements Participant {
    private String name;
    private int maxRun;
    private int maxHeight;

    public Cat(String name, int maxRun, int maxHeight) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        return this.maxRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.maxHeight >= height;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
