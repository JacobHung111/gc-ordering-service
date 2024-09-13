package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryNameEn;

    private String categoryNameZh;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNameEn() {
        return categoryNameEn;
    }

    public void setCategoryNameEn(String categoryNameEn) {
        this.categoryNameEn = categoryNameEn;
    }

    public String getCategoryNameZh() {
        return categoryNameZh;
    }

    public void setCategoryNameZh(String categoryNameZh) {
        this.categoryNameZh = categoryNameZh;
    }

}
