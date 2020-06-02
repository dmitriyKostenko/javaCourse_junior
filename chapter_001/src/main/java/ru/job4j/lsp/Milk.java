package ru.job4j.lsp;

import java.time.LocalDate;

public class Milk extends Food {
    public Milk(String name, LocalDate expireDate, LocalDate createDate, double price, int discount) {
        super(name, expireDate, createDate, price, discount);
    }
}
