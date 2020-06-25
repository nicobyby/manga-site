package com.omanga.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.omanga.dao.MangaMapper;
import com.omanga.entity.Manga;
import com.omanga.service.mangaService;
import org.springframework.stereotype.Service;

@Service
public class MangaServiceImpl extends ServiceImpl<MangaMapper, Manga> implements mangaService{
}
