package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ModificationType")
public class ModificationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer modiTypeID;

    private String modiTypeNameEN;
    private String modiTypeNameZH;

    // Getters and Setters
}
