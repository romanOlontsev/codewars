package com.codewars.tasks.theClockwiseSpiral;

import org.junit.Assert;
import org.junit.Test;

public class TheClockwiseSpiralTest {

    TheClockwiseSpiral spiral = new TheClockwiseSpiral();

    @Test
    public void should_test_spiral() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};

        Assert.assertArrayEquals(expected, spiral.createSpiral(3));

    }
}