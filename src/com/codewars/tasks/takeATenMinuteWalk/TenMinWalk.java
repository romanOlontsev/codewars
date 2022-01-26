package com.codewars.tasks.takeATenMinuteWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;
        int walkTime = 0;
        for (char dir : walk) {
            if (dir == 'n') {
                y++;
                walkTime++;
            } else if (dir == 's') {
                y--;
                walkTime++;
            } else if (dir == 'w') {
                x--;
                walkTime++;
            } else if (dir == 'e') {
                x++;
                walkTime++;
            }
        }
        return walkTime == 10 && x == 0 && y == 0;
    }
}