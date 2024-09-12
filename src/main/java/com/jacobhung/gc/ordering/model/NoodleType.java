package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "noodletype")
public class NoodleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noodletypeid")
    private int noodleTypeId;

    @Column(name = "noodletypename_en")
    private String noodleTypeNameEn;

    @Column(name = "noodletypename_zh")
    private String noodleTypeNameZh;

    @Column(name = "noodletypeprice")
    private Double noodleTypePrice;

    // Getters and Setters
}
