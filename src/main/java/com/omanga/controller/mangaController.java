package com.omanga.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.omanga.entity.Manga;
import com.omanga.entity.MangaChapter;
import com.omanga.entity.MangaList;
import com.omanga.entity.MangaPage;
import com.omanga.service.MangaChapterService;
import com.omanga.service.impl.MangaChapterServiceImpl;
import com.omanga.service.impl.MangaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mangaController {

    @Autowired
    private MangaServiceImpl mangaService;

    @Autowired
    private MangaChapterServiceImpl mangaChapterService;

    @RequestMapping("manga/listPage")
    public MangaList mangaPage(int current) {
        QueryWrapper<Manga> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","mname","coverUrl","status");

        Page<Manga> page = new Page<>(current, 30);

        IPage<Manga> ipage = mangaService.page(page, queryWrapper);

        MangaList mangaList = new MangaList();
        mangaList.setManga(ipage.getRecords());
        mangaList.setPages(ipage.getPages());
        mangaList.setTotals(ipage.getTotal());
        return mangaList;
    }

    @RequestMapping("manga/page")
    public MangaPage mangaChapters(String mangaName) {
        QueryWrapper<MangaChapter> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("comicName",mangaName).select("chaptername");
        List<MangaChapter> chapterList = mangaChapterService.list(queryWrapper);


        QueryWrapper<Manga> mangaQueryWrapper = new QueryWrapper<>();
        mangaQueryWrapper.eq("mname",mangaName);
        Manga one = mangaService.getOne(mangaQueryWrapper);
        MangaPage mangaPage = new MangaPage();
        mangaPage.setManga(one);
        mangaPage.setMangaChapterList(chapterList);

        return mangaPage;
    }

    @RequestMapping("manga/Chapter")
    public MangaChapter onemangaChapters(String mangaName,int chapter) {
        QueryWrapper<MangaChapter> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("comicName", mangaName).and(true,i -> i.eq("chaptername",chapter));
        MangaChapter one = mangaChapterService.getOne(queryWrapper);

        return one;
    }




}
