package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Modification")
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer modificationID;

    @ManyToOne
    @JoinColumn(name = "itemID")
    private Items item;

    @ManyToOne
    @JoinColumn(name = "modiTypeID")
    private ModificationType modificationType;

    // Getters and Setters
}
