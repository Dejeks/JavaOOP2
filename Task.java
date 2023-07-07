package org.example.Homework.HW8;


public class Task {
    public static void main(String[] args) {
        Runnable[] participants = {
                new Human("Женя", 100, 2),
                new Cat("Василий", 50, 3),
                new Robot("Робот-пылесос", 200)
        };

        Object[] obstacles = {
                new Track(80),
                new Wall(1),
                new Track(120),
                new Wall(2)
        };

        for (Runnable participant : participants) {
            boolean passedAllObstacles = true;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    Track track = (Track) obstacle;
                    track.pass(participant);
                } else if (obstacle instanceof Wall) {
                    Wall wall = (Wall) obstacle;
                    if (participant instanceof Jumpable) {
                        Jumpable jumpable = (Jumpable) participant;
                        wall.pass(jumpable);
                    } else {
                        System.out.println("Участник " + participant + " не умеет прыгать, поэтому не может пройти стену.");
                        passedAllObstacles = false;
                        break;
                    }
                }
            }
            if (!passedAllObstacles) {
                break;
            }
        }
    }
}
