package ru.job4j.lsp;

import java.util.List;

public interface Storage {

    boolean distribute(Food food);

    List<Food> getAllFood();
}
