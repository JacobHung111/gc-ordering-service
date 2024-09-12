package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryid")
    private int categoryId;

    @Column(name = "categoryname_en")
    private String categoryNameEn;

    @Column(name = "categoryname_zh")
    private String categoryNameZh;

    // Getters and Setters
}
