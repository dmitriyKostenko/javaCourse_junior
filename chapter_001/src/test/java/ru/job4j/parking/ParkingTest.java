package ru.job4j.parking;

import org.junit.Test;
import ru.job4j.lsp.parking.Car;
import ru.job4j.lsp.parking.FreeParking;
import ru.job4j.lsp.parking.Parking;
import ru.job4j.lsp.parking.Vehicle;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ParkingTest {

    @Test
    public void whenParkingHasFreePlaces() {
        Parking parking = new FreeParking();
        Vehicle car = new Car("Renault Logan", "X987MO161");
        assertThat(parking.checkFreePlace(car), is(true));
    }

    @Test
    public void whenParkingHasNoFreePlaces() {
        Parking parking = new FreeParking();
        Vehicle car = new Car("Renault Logan", "X987MO161");
        assertThat(parking.checkFreePlace(car), is(false));
    }

    @Test
    public void whenAddCarOnParking() {
        Parking parking = new FreeParking();
        Vehicle car = new Car("Renault Logan", "X987MO161");
        parking.add(car);
        List<Vehicle> list = List.of(car);
        assertThat(parking.getList(), is(list));
    }

    @Test
    public void whenRemoveCarFromParking() {
        Parking parking = new FreeParking();
        Vehicle car = new Car("Renault Logan", "X987MO161");
        parking.add(car);
        assertThat(parking.getList().size(), is(1));
        parking.remove("X987MO161");
        assertThat(parking.getList().size(), is(0));
    }
}
