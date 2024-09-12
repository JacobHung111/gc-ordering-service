package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "allergennotice")
public class AllergenNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allergennoticeid")
    private int allergenNoticeId;

    @ManyToOne
    @JoinColumn(name = "itemid")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "allergentypeid")
    private AllergenType allergenType;

    // Getters and Setters
}
