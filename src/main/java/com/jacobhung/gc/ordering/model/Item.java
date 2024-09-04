package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemID;

    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Categories category;

    private String itemNameEN;
    private String itemNameZH;

    @Lob
    private String descriptionEN;

    @Lob
    private String descriptionZH;

    private Double price;
    private String imageURL;
    private Character isIncludedDrink;
    private Character isNoodle;

    @ManyToOne
    @JoinColumn(name = "allergen")
    private AllergenNotice allergen;

    // Getters and Setters
}
