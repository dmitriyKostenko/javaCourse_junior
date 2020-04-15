package ru.job4j.srp;

import java.util.Map;
import java.util.function.Predicate;

public interface Department {
    Map<String, String> select(Predicate<Employee> filter, Store store);
}
