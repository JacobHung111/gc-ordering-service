package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Drinks")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drinkID;

    private String drinkNameEN;
    private String drinkNameZH;
    private Double price;

    // Getters and Setters
}