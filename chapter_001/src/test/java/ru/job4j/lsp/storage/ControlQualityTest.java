package ru.job4j.lsp.storage;

import org.junit.Test;
import ru.job4j.lsp.storage.*;

import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ControlQualityTest {

    @Test
    public void whenDistributeInWarehouse() {
        Warehouse warehouse = new Warehouse();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, new Shop(), new Trash()));
        Milk milk = new Milk("Moloko", LocalDate.of(2020, 5, 20), LocalDate.of(2020, 4, 29), 100.00, 0);
        controlQuality.sort(milk);
        assertThat(warehouse.getAllFood().get(0), is(milk));
    }

    @Test
    public void whenDistributeInShopWithoutDiscount() {
        Shop shop = new Shop();
        ControlQuality controlQuality = new ControlQuality(List.of(new Warehouse(), shop, new Trash()));
        Milk milk = new Milk("Moloko", LocalDate.of(2020, 5, 5), LocalDate.of(2020, 4, 20), 100.00, 0);
        controlQuality.sort(milk);
        assertThat(shop.getAllFood().get(0), is(milk));
    }

    @Test
    public void whenDistributeInShopWithDiscount() {
        Shop shop = new Shop();
        ControlQuality controlQuality = new ControlQuality(List.of(new Warehouse(), shop, new Trash()));
        Eggs eggs = new Eggs("Ryaba", LocalDate.of(2020, 5, 5), LocalDate.of(2020, 4, 20), 100.00, 0);
        controlQuality.sort(eggs);
        assertThat(shop.getAllFood().get(0), is(eggs));
        assertThat(shop.getAllFood().get(0).getPrice(), is(75.0));
    }

    @Test
    public void whenDistributeInTrash() {
        Trash trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(new Warehouse(), new Shop(), trash));
        Eggs eggs = new Eggs("Ryaba", LocalDate.of(2020, 4, 30), LocalDate.of(2020, 4, 20), 100.00, 0);
        controlQuality.sort(eggs);
        assertThat(trash.getAllFood().get(0), is(eggs));
    }
}
