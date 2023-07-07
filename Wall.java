package org.example.Homework.HW8;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void pass(Jumpable jumpable) {
        jumpable.jump(height);
    }
}
