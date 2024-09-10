package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AllergenNotice")
public class AllergenNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer allergenNoticeId;

    @ManyToOne
    @JoinColumn(name = "itemID")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "allergenTypeID")
    private AllergenType allergenType;

    // Getters and Setters
}
