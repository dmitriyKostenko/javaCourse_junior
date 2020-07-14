package ru.job4j.lsp.parking;

/**
 * Class for trucks. Default length = 3.
 * @author Dmitrii Kostenko kdm.tag@gmail.com
 * @version 1.0
 */

public class Truck extends Vehicle {
    public Truck(String model, String number) {
        super(model, number, 3);
    }
}
