package com.omanga.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "ChapterList")
public class MangaChapter {

    private int id;

    private String chaptername;
    private String chapterAddr;
    private String startVar;
    private String endVar;
    private String comicName;
    private int chapterId;

}
