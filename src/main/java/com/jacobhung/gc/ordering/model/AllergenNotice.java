package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AllergenNotice")
public class AllergenNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeID;

    @Lob
    private String noticeTextEN;

    @Lob
    private String noticeTextZH;

    // Getters and Setters
}
