package ru.job4j.srp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class AccountDepartment implements Department {
    private final double gross = 1.20;

    @Override
    public Map<String, String> select(Predicate<Employee> filter, Store store) {
        Map<String, String> map = new LinkedHashMap<>();
        for (Employee employee : store.findBy(filter)) {
            map.put("Name: ", employee.getName() + ";");
            map.put("Hired: ", employee.getHired().toString() + ";");
            map.put("Fired: ", employee.getFired().toString() + ";");
            map.put("Salary: ", employee.getSalary() * gross + " gross;");
        }
        return map;
    }
}
