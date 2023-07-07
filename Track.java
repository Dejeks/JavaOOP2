package org.example.Homework.HW8;

public class Track {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public void pass(Runnable runnable) {
        runnable.run(distance);
    }
}
