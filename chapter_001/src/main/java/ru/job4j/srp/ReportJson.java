package ru.job4j.srp;

import java.util.Map;

public class ReportJson implements Report {
    @Override
    public String create(Map<String, String> map) {
        StringBuilder json = new StringBuilder()
                .append("{ report: [")
                .append(System.lineSeparator());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            json.append(key).append(value)
                    .append(System.lineSeparator());
        }
        json.append("] }")
                .append(System.lineSeparator());
        return json.toString();
    }
}
