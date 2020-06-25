package com.omanga.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.omanga.dao.MangaChapterMapper;
import com.omanga.dao.MangaMapper;
import com.omanga.entity.Manga;
import com.omanga.entity.MangaChapter;
import com.omanga.service.MangaChapterService;
import com.omanga.service.mangaService;
import org.springframework.stereotype.Service;

@Service
public class MangaChapterServiceImpl extends ServiceImpl<MangaChapterMapper, MangaChapter> implements MangaChapterService {
}
