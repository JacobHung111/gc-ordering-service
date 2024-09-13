package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "noodletype")
public class NoodleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noodleTypeId;

    private String noodleTypeNameEn;

    private String noodleTypeNameZh;

    private Double noodleTypePrice;

    public int getNoodleTypeId() {
        return noodleTypeId;
    }

    public void setNoodleTypeId(int noodleTypeId) {
        this.noodleTypeId = noodleTypeId;
    }

    public String getNoodleTypeNameEn() {
        return noodleTypeNameEn;
    }

    public void setNoodleTypeNameEn(String noodleTypeNameEn) {
        this.noodleTypeNameEn = noodleTypeNameEn;
    }

    public String getNoodleTypeNameZh() {
        return noodleTypeNameZh;
    }

    public void setNoodleTypeNameZh(String noodleTypeNameZh) {
        this.noodleTypeNameZh = noodleTypeNameZh;
    }

    public Double getNoodleTypePrice() {
        return noodleTypePrice;
    }

    public void setNoodleTypePrice(Double noodleTypePrice) {
        this.noodleTypePrice = noodleTypePrice;
    }
}
