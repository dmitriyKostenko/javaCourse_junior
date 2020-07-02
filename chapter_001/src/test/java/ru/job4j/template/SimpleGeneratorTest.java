package ru.job4j.template;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SimpleGeneratorTest {
    @Test
    public void whenPassRightKey() {
        Generator generator = new SimpleGenerator();
        String template = "I am a ${name}, Who are ${subject}?";
        Map<String, String> args = Map.of(
                "name", "Dmitrii Kostenko",
                "subject", "you"
        );
        String expected = "I am a Dmitrii Kostenko, Who are you?";
        String result = generator.produce(template, args);
        assertThat(result, is(expected));
    }

    /*@Test(expected = IllegalArgumentException.class)
    public void whenMapHasIllegalKey() throws IllegalArgumentException {
        Generator generator = new SimpleGenerator();
        String template = "I am a ${name}, Who are ${subject}?";
        Map<String, String> args = Map.of(
                "name", "Dmitrii Kostenko",
                "age", "17",
                "subject", "you"
        );
        generator.produce(template, args);
    }

    @Test(expected = Exception.class)
    public void whenTemplateHasIllegalKey() {
        Generator generator = new SimpleGenerator();
        String template = "I am a ${name}, I am ${age} years old, Who are ${subject}?";
        Map<String, String> args = Map.of(
                "name", "Dmitrii Kostenko",
                "subject", "you"
        );
        generator.produce(template, args);
    }*/
}
