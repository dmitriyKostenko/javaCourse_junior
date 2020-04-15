package ru.job4j.srp;

import java.util.Map;

public class ReportText implements Report {
    @Override
    public String create(Map<String, String> map) {
        StringBuilder text = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            text.append(key).append(value).append(System.lineSeparator());
        }
        return text.toString();
    }
}
