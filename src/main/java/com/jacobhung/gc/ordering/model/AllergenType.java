package com.jacobhung.gc.ordering.model;

import jakarta.persistence.*;

@Entity
@Table(name = "allergentype")
public class AllergenType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int allergenTypeId;

    @Lob
    private String noticeTextEn;

    @Lob
    private String noticeTextZh;

    public int getAllergenTypeId() {
        return allergenTypeId;
    }

    public void setAllergenTypeId(int allergenTypeId) {
        this.allergenTypeId = allergenTypeId;
    }

    public String getNoticeTextEn() {
        return noticeTextEn;
    }

    public void setNoticeTextEn(String noticeTextEn) {
        this.noticeTextEn = noticeTextEn;
    }

    public String getNoticeTextZh() {
        return noticeTextZh;
    }

    public void setNoticeTextZh(String noticeTextZh) {
        this.noticeTextZh = noticeTextZh;
    }
}
