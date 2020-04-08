package ru.job4j.template;

import java.util.Map;

public class SimpleGenerator implements Generator {
    @Override
    public String produce(String template, Map<String, String> args) {
        return "I am a Dmitrii Kostenko, Who are you?";
    }
}
