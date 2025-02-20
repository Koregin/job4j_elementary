package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom20To30Then150() {
        int start = 20;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 150;
        Assert.assertEquals(expected, result);
    }
}