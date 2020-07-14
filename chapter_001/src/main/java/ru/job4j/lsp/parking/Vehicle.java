package ru.job4j.lsp.parking;

/**
 * Abstract class for all vehicles.
 * @author Dmitrii Kostenko kdm.tag@gmail.com
 * @version 1.0
 */

public abstract class Vehicle {
    private String model;
    private String number;
    private int length;

    public Vehicle(String model, String number, int length) {
        this.model = model;
        this.number = number;
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getLength() {
        return length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model='" + model + '\'' + ", number='" + number + '\'' + ", length=" + length + '}';
    }
}
