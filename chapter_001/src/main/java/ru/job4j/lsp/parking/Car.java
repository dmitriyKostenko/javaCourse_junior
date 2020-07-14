package ru.job4j.lsp.parking;

/**
 * Class for passenger cars. Default length = 1.
 * @author Dmitrii Kostenko kdm.tag@gmail.com
 * @version 1.0
 */

public class Car extends Vehicle {
    public Car(String model, String number) {
        super(model, number, 1);
    }
}
