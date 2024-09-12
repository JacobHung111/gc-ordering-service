package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modification")
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modificationid")
    private int modificationId;

    @ManyToOne
    @JoinColumn(name = "itemid")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "moditypeid")
    private ModificationType modificationType;

    // Getters and Setters
}
