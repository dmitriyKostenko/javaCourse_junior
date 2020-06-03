package ru.job4j.lsp.storage;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Storage {
    private final List<Food> foods = new ArrayList<>();

    @Override
    public boolean distribute(Food food) {
        boolean rsl = false;
        double percentShelfLife = food.getPercentShelfLife();
        if (percentShelfLife >= 25 && percentShelfLife < 75) {
            foods.add(food);
            rsl = true;
        }
        if (percentShelfLife >= 75 && percentShelfLife < 100) {
            food.setDiscount(25);
            food.setPrice(food.getPrice() * ((100 - food.getDiscount()) / 100));
            foods.add(food);
            rsl = true;
        }
        return rsl;
    }

    @Override
    public List<Food> getAllFood() {
        return foods;
    }
}
