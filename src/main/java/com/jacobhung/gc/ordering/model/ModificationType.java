package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "modificationtype")
public class ModificationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modiTypeId;

    private String modiTypeNameEn;

    private String modiTypeNameZh;

    public int getModiTypeId() {
        return modiTypeId;
    }

    public void setModiTypeId(int modiTypeId) {
        this.modiTypeId = modiTypeId;
    }

    public String getModiTypeNameEn() {
        return modiTypeNameEn;
    }

    public void setModiTypeNameEn(String modiTypeNameEn) {
        this.modiTypeNameEn = modiTypeNameEn;
    }

    public String getModiTypeNameZh() {
        return modiTypeNameZh;
    }

    public void setModiTypeNameZh(String modiTypeNameZh) {
        this.modiTypeNameZh = modiTypeNameZh;
    }
}
