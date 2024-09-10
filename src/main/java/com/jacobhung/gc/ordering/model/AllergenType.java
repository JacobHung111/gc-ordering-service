package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AllergenType")
public class AllergenType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer allergenTypeID;

    @Lob
    private String noticeTextEN;

    @Lob
    private String noticeTextZH;

    // Getters and Setters
}
