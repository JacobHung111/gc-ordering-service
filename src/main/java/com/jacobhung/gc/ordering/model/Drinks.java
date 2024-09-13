package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drinks")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drinkId;

    private String drinkNameEn;

    private String drinkNameZh;

    private Double price;

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkNameEn() {
        return drinkNameEn;
    }

    public void setDrinkNameEn(String drinkNameEn) {
        this.drinkNameEn = drinkNameEn;
    }

    public String getDrinkNameZh() {
        return drinkNameZh;
    }

    public void setDrinkNameZh(String drinkNameZh) {
        this.drinkNameZh = drinkNameZh;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
