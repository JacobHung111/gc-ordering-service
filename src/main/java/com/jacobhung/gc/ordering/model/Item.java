package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories category;

    private String itemNameEn;

    private String itemNameZh;

    private Double price;

    private String imageUrl;

    private boolean isIncludedDrink;

    private boolean isNoodle;

    public Categories getCategory() {
        return category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean getIsIncludedDrink() {
        return isIncludedDrink;
    }

    public boolean getIsNoodle() {
        return isNoodle;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemNameEn() {
        return itemNameEn;
    }

    public String getItemNameZh() {
        return itemNameZh;
    }

    public Double getPrice() {
        return price;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setIsIncludedDrink(boolean isIncludedDrink) {
        this.isIncludedDrink = isIncludedDrink;
    }

    public void setIsNoodle(boolean isNoodle) {
        this.isNoodle = isNoodle;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemNameEn(String itemNameEn) {
        this.itemNameEn = itemNameEn;
    }

    public void setItemNameZh(String itemNameZh) {
        this.itemNameZh = itemNameZh;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
