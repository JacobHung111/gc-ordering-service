package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Categories category;

    @Column(name = "itemname_en")
    private String itemNameEn;

    @Column(name = "itemname_zh")
    private String itemNameZh;

    @Column(name = "price")
    private Double price;

    @Column(name = "imageurl")
    private String imageUrl;

    @Column(name = "isincludeddrink")
    private char isIncludedDrink;

    @Column(name = "isnoodle")
    private char isNoodle;

    // Getters and Setters
}
