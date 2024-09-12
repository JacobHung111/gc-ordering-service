package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "allergentype")
public class AllergenType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allergentypeid")
    private int allergenTypeId;

    @Lob
    @Column(name = "noticetext_en")
    private String noticeTextEn;

    @Lob
    @Column(name = "noticetext_zh")
    private String noticeTextZh;

    // Getters and Setters
}
