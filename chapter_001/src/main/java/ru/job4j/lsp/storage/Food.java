package ru.job4j.lsp.storage;

import java.time.LocalDate;
import java.time.Period;

public abstract class Food {
    private String name;
    private LocalDate expireDate;
    private LocalDate createDate;
    private double price;
    private int discount;

    public Food(String name, LocalDate expireDate, LocalDate createDate, double price, int discount) {
        this.name = name;
        this.expireDate = expireDate;
        this.createDate = createDate;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPercentShelfLife() {
        Period shelfLifePeriod = Period.between(getCreateDate(), getExpireDate());
        Period expPeriod = Period.between(getCreateDate(), LocalDate.now());
        int shelfLife = shelfLifePeriod.getDays();
        int exp = expPeriod.getDays();
        return (double) exp * 100 / shelfLife;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", expireDate=" + expireDate +
                ", createDate=" + createDate +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
