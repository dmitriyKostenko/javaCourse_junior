package ru.job4j.kiss;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxMinTest {
    @Test
    public void whenFindMaxOfList() {
        MaxMin max = new MaxMin();
        var list = List.of(1, 2, 3, 4, 5);
        Comparator<Integer> comparator = Comparator.comparingInt(Integer::intValue);
        var result = max.max(list, comparator);
        assertThat(result, is(5));
    }

    @Test
    public void whenFindMinOfList() {
        MaxMin min = new MaxMin();
        var list = List.of(1, 2, 3, 4, 5);
        Comparator<Integer> comparator = Comparator.comparingInt(Integer::intValue);
        var result = min.min(list, comparator);
        assertThat(result, is(1));
    }
}
