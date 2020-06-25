package com.omanga.entity;

import java.util.List;

public class MangaPage {

    private List<MangaChapter> mangaChapterList;

    private Manga manga;

    public List<MangaChapter> getMangaChapterList() {
        return mangaChapterList;
    }

    public void setMangaChapterList(List<MangaChapter> mangaChapterList) {
        this.mangaChapterList = mangaChapterList;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    @Override
    public String toString() {
        return "MangaPage{" +
                "mangaChapterList=" + mangaChapterList +
                ", manga=" + manga +
                '}';
    }
}
