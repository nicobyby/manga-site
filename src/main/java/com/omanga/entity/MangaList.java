package com.omanga.entity;

import java.util.List;

public class MangaList {

    private List<Manga> manga;

    private Long pages;

    private Long totals;

    public List<Manga> getManga() {
        return manga;
    }

    public void setManga(List<Manga> manga) {
        this.manga = manga;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    @Override
    public String toString() {
        return "MangaList{" +
                "manga=" + manga +
                ", pages=" + pages +
                ", totals=" + totals +
                '}';
    }
}
