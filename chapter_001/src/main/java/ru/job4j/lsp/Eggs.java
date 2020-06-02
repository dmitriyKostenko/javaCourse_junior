package ru.job4j.lsp;

import java.time.LocalDate;

public class Eggs extends Food {
    public Eggs(String name, LocalDate expireDate, LocalDate createDate, double price, int discount) {
        super(name, expireDate, createDate, price, discount);
    }
}
