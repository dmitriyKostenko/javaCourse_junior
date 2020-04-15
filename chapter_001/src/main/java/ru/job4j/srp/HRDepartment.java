package ru.job4j.srp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class HRDepartment implements Department {
    @Override
    public Map<String, String> select(Predicate<Employee> filter, Store store) {
        Map<String, String> map = new LinkedHashMap<>();
        List<Employee> list = store.findBy(filter);
        list.sort(new SortBySalary());
        for (Employee employee : list) {
            map.put("Name: ", employee.getName() + ";");
            map.put("Salary: ", employee.getSalary() + ";");
        }
        return map;
    }
}
