package test.java.codewars.kata.kyu8;

import codewars.kata.kyu8.Kata_SumOfPositive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata_SumOfPositiveTest {

    @Test
    public void testSomething() {
        assertEquals(15, Kata_SumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Kata_SumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Kata_SumOfPositive.sum(new int[]{}));
        assertEquals(0, Kata_SumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Kata_SumOfPositive.sum(new int[]{-1,2,3,4,-5}));
    }
}