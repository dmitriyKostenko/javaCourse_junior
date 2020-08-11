package ru.job4j.lsp.parking;

/**
 * Class FreParking example implementation of the Parking interface.
 * @author Dmitrii Kostenko kdm.tag@gmail.com
 * @version 1.0
 */

public class FreeParking implements Parking {

    /**
     * Method check if parking has free place for vehicle
     *
     * @param vehicle
     */
    @Override
    public boolean checkFreePlace(Vehicle vehicle) {
        return false;
    }

    /**
     * Method add vehicle on parking.
     *
     * @param vehicle
     */
    @Override
    public void add(Vehicle vehicle) {

    }

    /**
     * Method remove vehicle from parking.
     * @param number
     */
    @Override
    public void remove(String number) {

    }
}
