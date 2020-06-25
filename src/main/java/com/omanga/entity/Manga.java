package com.omanga.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "manga_name")
public class Manga {

    private int id;

    private String mname;

    private String author;

    private String Introduction;

    private String status;

    private String coverUrl;

    private String updateTime;
}
