package ru.job4j.lsp.storage;

import java.util.List;

public class ControlQuality {
    private final List<Storage> stores;

    public ControlQuality(List<Storage> stores) {
        this.stores = stores;
    }

    public void sort(Food food) {
        for (Storage storage : stores) {
            if (storage.distribute(food)) {
                break;
            }
        }
    }
}
