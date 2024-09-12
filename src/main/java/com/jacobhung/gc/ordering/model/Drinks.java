package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drinks")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drinkid")
    private int drinkId;

    @Column(name = "drinkname_en")
    private String drinkNameEn;

    @Column(name = "drinkname_zh")
    private String drinkNameZh;

    @Column(name = "price")
    private Double price;

    // Getters and Setters
}
