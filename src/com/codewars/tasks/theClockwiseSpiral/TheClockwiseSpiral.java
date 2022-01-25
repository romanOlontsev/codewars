package com.codewars.tasks.theClockwiseSpiral;

public class TheClockwiseSpiral {

    public static int[][] createSpiral(int N) {
        int[][] array = new int[N][N];
        int rows = array.length;
        int cols = array[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        int dir = 1;
        int currentNumber = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; i++) {
                    array[top][i] = currentNumber;
                    currentNumber++;
                }
                dir = 2;
                top++;
            } else if (dir == 2) {
                for (int i = top; i <= bottom; i++) {
                    array[i][right] = currentNumber;
                    currentNumber++;
                }
                dir = 3;
                right--;
            } else if (dir == 3) {
                for (int i = right; i >= left; i--) {
                    array[bottom][i] = currentNumber;
                    currentNumber++;
                }
                dir = 4;
                bottom--;
            } else if (dir == 4) {
                for (int i = bottom; i >= top; i--) {
                    array[i][left] = currentNumber;
                    currentNumber++;
                }
                dir = 1;
                left++;
            }
        }
        return array;
    }
}