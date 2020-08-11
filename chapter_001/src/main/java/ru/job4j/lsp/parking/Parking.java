package ru.job4j.lsp.parking;

/**
 * Interface for parking.
 * @author Dmitrii Kostenko kdm.tag@gmail.com
 * @version 1.0
 */

public interface Parking {

    /**
     * Method check if parking has free place for vehicle
     * @param vehicle
     */
    boolean checkFreePlace(Vehicle vehicle);

    /**
     * Method add vehicle on parking.
     * @param vehicle
     */
    void add(Vehicle vehicle);

    /**
     * Method remove vehicle from parking.
     * * @param number
     */
    void remove(String number);
}
