package ru.job4j.lsp.storage;

import java.util.List;

public interface Storage {

    boolean distribute(Food food);

    List<Food> getAllFood();
}
