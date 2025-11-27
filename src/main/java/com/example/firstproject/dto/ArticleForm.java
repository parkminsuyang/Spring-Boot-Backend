package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id; //id 필드 추가
    private String title; //제목을 받을 필드
    private String content; //내용을 받을 필드

    // 데이터를 잘 받았는지 확인


    public Article toEntity() {
        return new Article(id,title,content);
    }
}

