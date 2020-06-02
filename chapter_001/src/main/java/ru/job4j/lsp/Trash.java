package ru.job4j.lsp;

import java.util.ArrayList;
import java.util.List;

public class Trash implements Storage {
    private final List<Food> foods = new ArrayList<>();

    @Override
    public boolean distribute(Food food) {
        boolean rsl = false;
        double percentShelfLife = food.getPercentShelfLife();
        if (percentShelfLife >= 100) {
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
