package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "NoodleTypes")
public class NoodleTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noodleTypeID;

    private String noodleTypeNameEN;
    private String noodleTypeNameZH;
    private Double noodleTypePrice;

    // Getters and Setters
}