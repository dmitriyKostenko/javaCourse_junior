package ru.job4j.kiss;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MaxMin {

    public <T> T find(List<T> value, Comparator<T> comparator) {
        Iterator<T> iterator = value.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (comparator.compare(element, result) > 0) {
                result = element;
            }
        }
        return result;
    }

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return find(value, comparator);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return find(value, comparator.reversed());
    }
}
