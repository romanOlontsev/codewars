package com.codewars.tasks.stringMerge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1(){
        assertEquals("pere", Kata.stringMerge("person","here", 'e'));
    }
    @Test
    public void test2(){
        assertEquals("apowiejouh", Kata.stringMerge("apowiejfoiajsf","iwahfeijouh", 'j'));
    }
    @Test
    public void test3(){
        assertEquals("abcdefxxxyyyxyzz", Kata.stringMerge("abcdefxxxyzz","abcxxxyyyxyzz", 'x'));
    }
}