package ru.job4j.srp;

import java.util.Map;

public class ReportHtml implements Report {
    @Override
    public String create(Map<String, String> map) {
        StringBuilder html = new StringBuilder()
                .append("<!DOCTYPE html>")
                .append(System.lineSeparator())
                .append("<html>")
                .append(System.lineSeparator())
                .append("<body>")
                .append(System.lineSeparator());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            html.append("<p>").append(key).append(value).append("</p>")
                    .append(System.lineSeparator());
        }
        html.append("</body>")
                .append(System.lineSeparator())
                .append("</html>")
                .append(System.lineSeparator());

        return html.toString();
    }
}