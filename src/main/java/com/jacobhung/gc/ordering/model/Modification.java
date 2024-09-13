package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modification")
public class Modification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modificationId;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "modiTypeId")
    private ModificationType modificationType;

    public int getModificationId() {
        return modificationId;
    }

    public void setModificationId(int modificationId) {
        this.modificationId = modificationId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ModificationType getModificationType() {
        return modificationType;
    }

    public void setModificationType(ModificationType modificationType) {
        this.modificationType = modificationType;
    }
}
