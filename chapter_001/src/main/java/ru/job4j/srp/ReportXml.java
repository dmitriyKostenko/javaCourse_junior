package ru.job4j.srp;

import java.util.Map;

public class ReportXml implements Report {
    @Override
    public String create(Map<String, String> map) {
        StringBuilder xml = new StringBuilder()
                .append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append(System.lineSeparator())
                .append("<report>")
                .append(System.lineSeparator())
                .append("<employee>")
                .append(System.lineSeparator());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            xml.append("<line>").append(key).append(value).append("</line>")
                    .append(System.lineSeparator());
        }
        xml.append("</employee>")
                .append(System.lineSeparator())
                .append("</report>")
                .append(System.lineSeparator());
        return xml.toString();
    }
}
