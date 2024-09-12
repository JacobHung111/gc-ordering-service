package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modificationtype")
public class ModificationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moditypeid")
    private int modiTypeId;

    @Column(name = "moditypename_en")
    private String modiTypeNameEn;

    @Column(name = "moditypename_zh")
    private String modiTypeNameZh;

    // Getters and Setters
}
