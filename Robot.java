package org.example.Homework.HW8;

public class Robot implements Runnable {
    private String name;
    private int maxRunDistance;

    public Robot(String name, int maxRunDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }
    }
}
