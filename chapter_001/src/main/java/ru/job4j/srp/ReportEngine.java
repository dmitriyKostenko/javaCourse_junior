package ru.job4j.srp;

import java.util.function.Predicate;

public class ReportEngine {
    private Store store;

    public ReportEngine(Store store) {
        this.store = store;
    }

    public String generate(Predicate<Employee> filter, Report report, Department department) {
        return report.create(department.select(filter, store));
    }
}
