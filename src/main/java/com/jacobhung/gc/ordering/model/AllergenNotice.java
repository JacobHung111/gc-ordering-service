package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "allergennotice")
public class AllergenNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int allergenNoticeId;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "allergenTypeId")
    private AllergenType allergenType;

    public int getAllergenNoticeId() {
        return allergenNoticeId;
    }

    public AllergenType getAllergenType() {
        return allergenType;
    }

    public Item getItem() {
        return item;
    }

    public void setAllergenNoticeId(int allergenNoticeId) {
        this.allergenNoticeId = allergenNoticeId;
    }

    public void setAllergenType(AllergenType allergenType) {
        this.allergenType = allergenType;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
